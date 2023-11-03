public class JWTRefreshEndpoint extends AssignmentEndpoint {

  public static final String PASSWORD = "bm5nhSkxCXZkKRy4";
  private static final String JWT_PASSWORD = "bm5n3SkxCX4kKRy4";
  private static final List<String> validRefreshTokens = new ArrayList<>();

  @PostMapping(
      value = "/JWT/refresh/login",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
