# Changelog

### [3.0.1204] - 2024-07-05

- fix: `CommonRequest` now supports null values
- feat: Added `isStream()` helper function to support non-stream calls in a stream context
- feat: Supports closing SSE responses
- fix: Appended the cause in `TencentCloudSDKException::toString`
- fix: Fixed an I/O exception capture issue
- feat: `CommonRequest`/`Response`
- fix: Explicitly use UTF-8 as the SSE decoder, because on JDK8 Windows platforms, `Charset.defaultCharset()` may
  provide a character set other than UTF-8
- feat: Supports `apigw` endpoint
- feat: `OIDCRoleArnProvider` supports automatic refresh

### [3.0.1133] - 2025-04-15

- feat: Added an API for custom HTTP clients

### [3.0.792] - 2023-10-19

- fix: Removed dependency on `jaxb-api`
- feat: Supports `text/event-stream`
- feat: The Java SDK now supports custom headers
- feat: Supports `OIDCRoleArnProvider`
- feat: Regional circuit breaking
- fix: Uses an OkHttpClient singleton to minimize memory footprint
- feat: `SSLSocketFactory`
- fix: Downgraded `okhttp` to support JDK 7
- fix: Supports connection pooling
- feat: `CommonClient` now supports calling `octet-stream` APIs

### [3.0.778] - 2023-09-21

- fix: Java SDK now supports signature-free APIs

### [3.0.3] - 2020-01-20

- feat: Supports TC3-HMAC-SHA256 signature
- feat: Supports `multipart`
- fix: Changed the default signature method to TC3-HMAC-SHA256
- feat: Supports custom parameters
- feat: Added logging support
- feat: Added proxy support