package com.tencentcloudapi.kms.v20190118;
public enum KmsErrorCode {
    // CAM signature/authentication error
     AUTHFAILURE("AuthFailure"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // The CMK is being used by a Tencent Cloud product.
     FAILEDOPERATION_CMKUSEDBYCLOUDPRODUCT("FailedOperation.CmkUsedByCloudProduct"),
     
    // Decryption failed.
     FAILEDOPERATION_DECRYPTERROR("FailedOperation.DecryptError"),
     
    // Encryption failed.
     FAILEDOPERATION_ENCRYPTIONERROR("FailedOperation.EncryptionError"),
     
    // Tagging error.
     FAILEDOPERATION_TAGGINGERROR("FailedOperation.TaggingError"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Invalid parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Decryption of `EncryptedKeyMaterial` failed.
     INVALIDPARAMETER_DECRYPTMATERIALERROR("InvalidParameter.DecryptMaterialError"),
     
    // The schedule deletion time parameter is invalid.
     INVALIDPARAMETER_INVALIDPENDINGWINDOWINDAYS("InvalidParameter.InvalidPendingWindowInDays"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The alias already exists.
     INVALIDPARAMETERVALUE_ALIASALREADYEXISTS("InvalidParameterValue.AliasAlreadyExists"),
     
    // Duplicate `KeyId`.
     INVALIDPARAMETERVALUE_DUPLICATEDKEYID("InvalidParameterValue.DuplicatedKeyId"),
     
    // Incorrect alias format
     INVALIDPARAMETERVALUE_INVALIDALIAS("InvalidParameterValue.InvalidAlias"),
     
    // Incorrect ciphertext format
     INVALIDPARAMETERVALUE_INVALIDCIPHERTEXT("InvalidParameterValue.InvalidCiphertext"),
     
    // Invalid HSM cluster ID.
     INVALIDPARAMETERVALUE_INVALIDHSMCLUSTERID("InvalidParameterValue.InvalidHsmClusterId"),
     
    // Invalid `KeyId`.
     INVALIDPARAMETERVALUE_INVALIDKEYID("InvalidParameterValue.InvalidKeyId"),
     
    // Incorrect `KeyUsage` parameter.
     INVALIDPARAMETERVALUE_INVALIDKEYUSAGE("InvalidParameterValue.InvalidKeyUsage"),
     
    // Invalid `Plaintext`.
     INVALIDPARAMETERVALUE_INVALIDPLAINTEXT("InvalidParameterValue.InvalidPlaintext"),
     
    // Incorrect `Type` parameter.
     INVALIDPARAMETERVALUE_INVALIDTYPE("InvalidParameterValue.InvalidType"),
     
    // The key material is different from the one previously imported.
     INVALIDPARAMETERVALUE_MATERIALNOTMATCH("InvalidParameterValue.MaterialNotMatch"),
     
    // Duplicate tag key.
     INVALIDPARAMETERVALUE_TAGKEYSDUPLICATED("InvalidParameterValue.TagKeysDuplicated"),
     
    // The tag key or tag value does not exist.
     INVALIDPARAMETERVALUE_TAGSNOTEXISTED("InvalidParameterValue.TagsNotExisted"),
     
    // The number of CMKs has reached the upper limit.
     LIMITEXCEEDED_CMKLIMITEXCEEDED("LimitExceeded.CmkLimitExceeded"),
     
    // The number of device fingerprints exceeded the limit.
     LIMITEXCEEDED_FINGERPRINTSLIMITEXCEEDED("LimitExceeded.FingerprintsLimitExceeded"),
     
    // The number of created keys exceeded the limit.
     LIMITEXCEEDED_KEYLIMITEXCEEDED("LimitExceeded.KeyLimitExceeded"),
     
    // Missing parameters. Please check and try again.
     MISSINGPARAMETER("MissingParameter"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The CMK is not bound with the Tencent Cloud resource
     RESOURCEUNAVAILABLE_CLOUDRESOURCEBINDINGNOTFOUND("ResourceUnavailable.CloudResourceBindingNotFound"),
     
    // The CMK has been archived.
     RESOURCEUNAVAILABLE_CMKARCHIVED("ResourceUnavailable.CmkArchived"),
     
    // The CMK has been disabled.
     RESOURCEUNAVAILABLE_CMKDISABLED("ResourceUnavailable.CmkDisabled"),
     
    // The CMK does not exist.
     RESOURCEUNAVAILABLE_CMKNOTFOUND("ResourceUnavailable.CmkNotFound"),
     
    // As the CMK is not scheduled for deletion, you cannot cancel the schedule deletion.
     RESOURCEUNAVAILABLE_CMKNOTPENDINGDELETE("ResourceUnavailable.CmkNotPendingDelete"),
     
    // An enabled CMK cannot be scheduled for deletion.
     RESOURCEUNAVAILABLE_CMKSHOULDBEDISABLED("ResourceUnavailable.CmkShouldBeDisabled"),
     
    // This operation cannot be performed under the current CMK status.
     RESOURCEUNAVAILABLE_CMKSTATENOTSUPPORT("ResourceUnavailable.CmkStateNotSupport"),
     
    // The key has been disabled.
     RESOURCEUNAVAILABLE_KEYDISABLED("ResourceUnavailable.KeyDisabled"),
     
    // The key is not available as it’s pending deleted.
     RESOURCEUNAVAILABLE_KEYPENDINGDELETE("ResourceUnavailable.KeyPendingDelete"),
     
    // The white-box key service has not been activated.
     RESOURCEUNAVAILABLE_NOTPURCHASED("ResourceUnavailable.NotPurchased"),
     
    // Token has expired.
     RESOURCEUNAVAILABLE_TOKENEXPIRED("ResourceUnavailable.TokenExpired"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unsupported operation.
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
    // External CMKs cannot be rotated.
     UNSUPPORTEDOPERATION_EXTERNALCMKCANNOTROTATE("UnsupportedOperation.ExternalCmkCanNotRotate"),
     
    // Incorrect CMK type. Only `External` CMKs are supported.
     UNSUPPORTEDOPERATION_NOTEXTERNALCMK("UnsupportedOperation.NotExternalCmk"),
     
    // You can only update the CMKs created by you.
     UNSUPPORTEDOPERATION_NOTUSERCREATEDCMK("UnsupportedOperation.NotUserCreatedCmk"),
     
    // The service is temporarily unavailable.
     UNSUPPORTEDOPERATION_SERVICETEMPORARYUNAVAILABLE("UnsupportedOperation.ServiceTemporaryUnavailable"),
     
    // The encryption method is not supported in the current region.
     UNSUPPORTEDOPERATION_UNSUPPORTEDKEYUSAGEINCURRENTREGION("UnsupportedOperation.UnsupportedKeyUsageInCurrentRegion");
     
    private String value;
    private KmsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

