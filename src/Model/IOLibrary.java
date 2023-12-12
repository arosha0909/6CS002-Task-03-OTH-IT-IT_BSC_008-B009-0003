package Model;

import java.io.*;
import java.net.*;

public final class IOLibrary {

    public static String getString() throws IOException {
        return readLineFromSystemIn();
    }

    public static InetAddress getIPAddress() throws InvalidIPAddressException, IOException {
        IPAddress ipAddress = IPAddress.parseFrom(readLineFromSystemIn());
        return ipAddress.toInetAddress();
    }

    private static String readLineFromSystemIn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) {
            throw new IOException("Input stream closed or end of stream reached.");
        }
        return line;
    }

    private static class IPAddress {
        private byte[] data;

        private IPAddress(byte[] data) {
            this.data = data;
        }

        public static IPAddress parseFrom(String input) throws InvalidIPAddressException {
            try {
                String[] chunks = input.split("\\.");
                byte[] data = {
                    Byte.parseByte(chunks[0]),
                    Byte.parseByte(chunks[1]),
                    Byte.parseByte(chunks[2]),
                    Byte.parseByte(chunks[3])
                };
                return new IPAddress(data);
            } catch (Exception e) {
                throw new InvalidIPAddressException("Invalid IP address format.", e);
            }
        }

        public InetAddress toInetAddress() throws InvalidIPAddressException {
            try {
                return Inet4Address.getByAddress(data);
            } catch (UnknownHostException e) {
                throw new InvalidIPAddressException("Error converting to InetAddress.", e);
            }
        }
    }

    public static class InvalidIPAddressException extends Exception {
        public InvalidIPAddressException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
