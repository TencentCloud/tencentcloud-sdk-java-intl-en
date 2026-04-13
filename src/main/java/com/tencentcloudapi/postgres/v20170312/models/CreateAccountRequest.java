/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel {

    /**
    * Instance ID. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * The name of the account created. Consists of letters (a-z, A-Z), numbers (0-9), underscores (_), starts with a letter or (_), up to 63 characters. Cannot use system reserved keywords, cannot be postgres, and cannot begin with pg_or tencentdb_
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Account type. currently supported: normal, tencentDBSuper. normal references a general user, tencentDBSuper is an account that possesses the pg_tencentdb_superuser role.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the corresponding password for the account. the password rules are as follows:.
<Li>Specifies a length of 8 to 32 characters. a password of more than 12 characters is recommended.</li>.
<Li>Cannot start with "/".</li>.
<Li>Specifies the following four items must be included.</li>.

Valid values: a to z (lowercase letters).           
Uppercase letters: A - Z.
Valid values: 0 - 9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.

    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Account remark. only allow english letters, digits, underscore, hyphen, and chinese characters, limited to 60 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies whether CAM verification is enabled for the account.
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

    /**
     * Get Instance ID. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. can be obtained through the DescribeDBInstances api (https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get The name of the account created. Consists of letters (a-z, A-Z), numbers (0-9), underscores (_), starts with a letter or (_), up to 63 characters. Cannot use system reserved keywords, cannot be postgres, and cannot begin with pg_or tencentdb_ 
     * @return UserName The name of the account created. Consists of letters (a-z, A-Z), numbers (0-9), underscores (_), starts with a letter or (_), up to 63 characters. Cannot use system reserved keywords, cannot be postgres, and cannot begin with pg_or tencentdb_
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set The name of the account created. Consists of letters (a-z, A-Z), numbers (0-9), underscores (_), starts with a letter or (_), up to 63 characters. Cannot use system reserved keywords, cannot be postgres, and cannot begin with pg_or tencentdb_
     * @param UserName The name of the account created. Consists of letters (a-z, A-Z), numbers (0-9), underscores (_), starts with a letter or (_), up to 63 characters. Cannot use system reserved keywords, cannot be postgres, and cannot begin with pg_or tencentdb_
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Account type. currently supported: normal, tencentDBSuper. normal references a general user, tencentDBSuper is an account that possesses the pg_tencentdb_superuser role. 
     * @return Type Account type. currently supported: normal, tencentDBSuper. normal references a general user, tencentDBSuper is an account that possesses the pg_tencentdb_superuser role.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Account type. currently supported: normal, tencentDBSuper. normal references a general user, tencentDBSuper is an account that possesses the pg_tencentdb_superuser role.
     * @param Type Account type. currently supported: normal, tencentDBSuper. normal references a general user, tencentDBSuper is an account that possesses the pg_tencentdb_superuser role.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the corresponding password for the account. the password rules are as follows:.
<Li>Specifies a length of 8 to 32 characters. a password of more than 12 characters is recommended.</li>.
<Li>Cannot start with "/".</li>.
<Li>Specifies the following four items must be included.</li>.

Valid values: a to z (lowercase letters).           
Uppercase letters: A - Z.
Valid values: 0 - 9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.
 
     * @return Password Specifies the corresponding password for the account. the password rules are as follows:.
<Li>Specifies a length of 8 to 32 characters. a password of more than 12 characters is recommended.</li>.
<Li>Cannot start with "/".</li>.
<Li>Specifies the following four items must be included.</li>.

Valid values: a to z (lowercase letters).           
Uppercase letters: A - Z.
Valid values: 0 - 9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.

     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Specifies the corresponding password for the account. the password rules are as follows:.
<Li>Specifies a length of 8 to 32 characters. a password of more than 12 characters is recommended.</li>.
<Li>Cannot start with "/".</li>.
<Li>Specifies the following four items must be included.</li>.

Valid values: a to z (lowercase letters).           
Uppercase letters: A - Z.
Valid values: 0 - 9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.

     * @param Password Specifies the corresponding password for the account. the password rules are as follows:.
<Li>Specifies a length of 8 to 32 characters. a password of more than 12 characters is recommended.</li>.
<Li>Cannot start with "/".</li>.
<Li>Specifies the following four items must be included.</li>.

Valid values: a to z (lowercase letters).           
Uppercase letters: A - Z.
Valid values: 0 - 9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.

     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Account remark. only allow english letters, digits, underscore, hyphen, and chinese characters, limited to 60 characters. 
     * @return Remark Account remark. only allow english letters, digits, underscore, hyphen, and chinese characters, limited to 60 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Account remark. only allow english letters, digits, underscore, hyphen, and chinese characters, limited to 60 characters.
     * @param Remark Account remark. only allow english letters, digits, underscore, hyphen, and chinese characters, limited to 60 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies whether CAM verification is enabled for the account. 
     * @return OpenCam Specifies whether CAM verification is enabled for the account.
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set Specifies whether CAM verification is enabled for the account.
     * @param OpenCam Specifies whether CAM verification is enabled for the account.
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
    }

    public CreateAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountRequest(CreateAccountRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OpenCam != null) {
            this.OpenCam = new Boolean(source.OpenCam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OpenCam", this.OpenCam);

    }
}

