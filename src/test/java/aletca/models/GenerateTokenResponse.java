package aletca.models;

public class GenerateTokenResponse {
    /*
    {
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6ImFsZXgiLCJwYXNzd29yZCI6ImFzZHNhZCNmcmV3X0RGUzIiLCJpYXQiOjE2NTAwNTA0MTl9.g7fEMBRFoaGXn-56glWej_J-eH-n5HdLAi44DG17icY",
    "expires": "2022-04-22T19:20:19.042Z",
    "status": "Success",
    "result": "User authorized successfully."
    }
     */

    private String token;
    private String expires;
    private String status;
    private String result;

    public String getToken() {
        return token;
    }

    public String getExpires() {
        return expires;
    }

    public String getStatus() {
        return status;
    }

    public String getResult() {
        return result;
    }
}
