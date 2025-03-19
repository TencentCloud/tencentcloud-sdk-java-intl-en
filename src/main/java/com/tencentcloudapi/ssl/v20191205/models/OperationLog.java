/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel {

    /**
    * Action performed on logs
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Time when the action is performed
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Root account.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub-Account.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * Certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Each operation type corresponds to a specific operation description. the following is a textual explanation of each operation type and its description:.
1. apply: indicates applying for a free cert.
2. delete: indicates a deletion.
3. download - represents the download operation.
4. upload: indicates an upload operation.
5. revoke: indicates revoking a cert.
6. cancelRevoke - indicates canceling the revocation operation.
7. updateAlias - indicates updating the remark information.
8. changeProject - indicates assigning the certificate to a certain project.
9. uploadConfirmLetter - indicates uploading the confirmation letter.
10. cancel - indicates canceling the order operation.
11. replace - specifies reissuing a certificate.
12. downloadConfirmLetter - specifies downloading a certificate revocation confirmation letter.
13. editRevokeLetter - specifies uploading a certificate revocation confirmation letter.
14. renewVIP - specifies renewing a paid certificate.
15. applyVIP - specifies applying for a paid certificate.
16. submitInfo - specifies submitting documentation.
17. downloadConfirmLetter - specifies downloading the confirmation letter template.
18. uploadFromYunAPI - indicates uploading via the cloud api.
19. transferIn - indicates the certificate transfer to operation.
20. transferOut - indicates the certificate transfer operation.
21. refund - indicates applying for a refund.
22. multiYearsRenew - indicates multi-year auto-renewal.
23. modifyDownloadLimit - indicates modifying the download limit switch.
24. issued - indicates certificate issuance.
25. domainValidationPassed - indicates domain verification completed.
26. Resubmit - indicates reapplying for a certificate.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Action performed on logs 
     * @return Action Action performed on logs
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action performed on logs
     * @param Action Action performed on logs
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Time when the action is performed 
     * @return CreatedOn Time when the action is performed
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Time when the action is performed
     * @param CreatedOn Time when the action is performed
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Root account.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Uin Root account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Root account.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Uin Root account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-Account.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubAccountUin Sub-Account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub-Account.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubAccountUin Sub-Account.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get Certificate id.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertId Certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertId Certificate id.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Each operation type corresponds to a specific operation description. the following is a textual explanation of each operation type and its description:.
1. apply: indicates applying for a free cert.
2. delete: indicates a deletion.
3. download - represents the download operation.
4. upload: indicates an upload operation.
5. revoke: indicates revoking a cert.
6. cancelRevoke - indicates canceling the revocation operation.
7. updateAlias - indicates updating the remark information.
8. changeProject - indicates assigning the certificate to a certain project.
9. uploadConfirmLetter - indicates uploading the confirmation letter.
10. cancel - indicates canceling the order operation.
11. replace - specifies reissuing a certificate.
12. downloadConfirmLetter - specifies downloading a certificate revocation confirmation letter.
13. editRevokeLetter - specifies uploading a certificate revocation confirmation letter.
14. renewVIP - specifies renewing a paid certificate.
15. applyVIP - specifies applying for a paid certificate.
16. submitInfo - specifies submitting documentation.
17. downloadConfirmLetter - specifies downloading the confirmation letter template.
18. uploadFromYunAPI - indicates uploading via the cloud api.
19. transferIn - indicates the certificate transfer to operation.
20. transferOut - indicates the certificate transfer operation.
21. refund - indicates applying for a refund.
22. multiYearsRenew - indicates multi-year auto-renewal.
23. modifyDownloadLimit - indicates modifying the download limit switch.
24. issued - indicates certificate issuance.
25. domainValidationPassed - indicates domain verification completed.
26. Resubmit - indicates reapplying for a certificate.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type Each operation type corresponds to a specific operation description. the following is a textual explanation of each operation type and its description:.
1. apply: indicates applying for a free cert.
2. delete: indicates a deletion.
3. download - represents the download operation.
4. upload: indicates an upload operation.
5. revoke: indicates revoking a cert.
6. cancelRevoke - indicates canceling the revocation operation.
7. updateAlias - indicates updating the remark information.
8. changeProject - indicates assigning the certificate to a certain project.
9. uploadConfirmLetter - indicates uploading the confirmation letter.
10. cancel - indicates canceling the order operation.
11. replace - specifies reissuing a certificate.
12. downloadConfirmLetter - specifies downloading a certificate revocation confirmation letter.
13. editRevokeLetter - specifies uploading a certificate revocation confirmation letter.
14. renewVIP - specifies renewing a paid certificate.
15. applyVIP - specifies applying for a paid certificate.
16. submitInfo - specifies submitting documentation.
17. downloadConfirmLetter - specifies downloading the confirmation letter template.
18. uploadFromYunAPI - indicates uploading via the cloud api.
19. transferIn - indicates the certificate transfer to operation.
20. transferOut - indicates the certificate transfer operation.
21. refund - indicates applying for a refund.
22. multiYearsRenew - indicates multi-year auto-renewal.
23. modifyDownloadLimit - indicates modifying the download limit switch.
24. issued - indicates certificate issuance.
25. domainValidationPassed - indicates domain verification completed.
26. Resubmit - indicates reapplying for a certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Each operation type corresponds to a specific operation description. the following is a textual explanation of each operation type and its description:.
1. apply: indicates applying for a free cert.
2. delete: indicates a deletion.
3. download - represents the download operation.
4. upload: indicates an upload operation.
5. revoke: indicates revoking a cert.
6. cancelRevoke - indicates canceling the revocation operation.
7. updateAlias - indicates updating the remark information.
8. changeProject - indicates assigning the certificate to a certain project.
9. uploadConfirmLetter - indicates uploading the confirmation letter.
10. cancel - indicates canceling the order operation.
11. replace - specifies reissuing a certificate.
12. downloadConfirmLetter - specifies downloading a certificate revocation confirmation letter.
13. editRevokeLetter - specifies uploading a certificate revocation confirmation letter.
14. renewVIP - specifies renewing a paid certificate.
15. applyVIP - specifies applying for a paid certificate.
16. submitInfo - specifies submitting documentation.
17. downloadConfirmLetter - specifies downloading the confirmation letter template.
18. uploadFromYunAPI - indicates uploading via the cloud api.
19. transferIn - indicates the certificate transfer to operation.
20. transferOut - indicates the certificate transfer operation.
21. refund - indicates applying for a refund.
22. multiYearsRenew - indicates multi-year auto-renewal.
23. modifyDownloadLimit - indicates modifying the download limit switch.
24. issued - indicates certificate issuance.
25. domainValidationPassed - indicates domain verification completed.
26. Resubmit - indicates reapplying for a certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type Each operation type corresponds to a specific operation description. the following is a textual explanation of each operation type and its description:.
1. apply: indicates applying for a free cert.
2. delete: indicates a deletion.
3. download - represents the download operation.
4. upload: indicates an upload operation.
5. revoke: indicates revoking a cert.
6. cancelRevoke - indicates canceling the revocation operation.
7. updateAlias - indicates updating the remark information.
8. changeProject - indicates assigning the certificate to a certain project.
9. uploadConfirmLetter - indicates uploading the confirmation letter.
10. cancel - indicates canceling the order operation.
11. replace - specifies reissuing a certificate.
12. downloadConfirmLetter - specifies downloading a certificate revocation confirmation letter.
13. editRevokeLetter - specifies uploading a certificate revocation confirmation letter.
14. renewVIP - specifies renewing a paid certificate.
15. applyVIP - specifies applying for a paid certificate.
16. submitInfo - specifies submitting documentation.
17. downloadConfirmLetter - specifies downloading the confirmation letter template.
18. uploadFromYunAPI - indicates uploading via the cloud api.
19. transferIn - indicates the certificate transfer to operation.
20. transferOut - indicates the certificate transfer operation.
21. refund - indicates applying for a refund.
22. multiYearsRenew - indicates multi-year auto-renewal.
23. modifyDownloadLimit - indicates modifying the download limit switch.
24. issued - indicates certificate issuance.
25. domainValidationPassed - indicates domain verification completed.
26. Resubmit - indicates reapplying for a certificate.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

