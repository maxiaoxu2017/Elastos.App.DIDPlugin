package com.ela.wallet.sdk.didlibrary.global;

public class Constants {

    public static final boolean isDebug = false;

    public static final String SP_KEY_DID_PRIVATEKEY = "did_privatekey";
    public static final String SP_KEY_DID_PUBLICKEY = "did_publickey";
    public static final String SP_KEY_DID = "did";
    public static final String SP_KEY_DID_ADDRESS = "did_address";
    public static final String SP_KEY_DID_MNEMONIC = "did_mnemonic";
    public static final String SP_KEY_DID_PASSWORD = "did_password";
    public static final String SP_KEY_DID_ISBACKUP = "did_backup";
    public static final String SP_KEY_APP_LANGUAGE = "app_language";

    public static final String SP_KEY_UUID = "uuid";

    public static final String SP_KEY_DID_INFO = "did_info";

    public static final String FILE_NAME = "did.dat";

    public static final int INTENT_REQUEST_CODE_SCAN = 1001;
    public static final int INTENT_REQUEST_CODE_LANGUAGE = 1002;
    public static final int INTENT_REQUEST_CODE_IMPORT = 1003;

    public static final String INTENT_PARAM_KEY_SCANRESUTL = "scan_result";
    public static final String INTENT_PARAM_KEY_QRCODE_FROM = "qrcode_from";
}
