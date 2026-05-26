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

public class ResetAccountPasswordRequest extends AbstractModel {

    /**
    * Specifies the instance ID, such as postgres-4wdeb0zv. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance account name. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Specifies the new password for the UserName account.
Password settings rule specifies the following:.
- valid values: 8 to 32 characters. a password with more than 12 characters is recommended.
-Must not start with "/".
-Must include the following four items:.
Lowercase letters a ~ z.
Uppercase letters: A – Z.
Digits: 0-9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Specifies the instance ID, such as postgres-4wdeb0zv. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Specifies the instance ID, such as postgres-4wdeb0zv. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID, such as postgres-4wdeb0zv. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Specifies the instance ID, such as postgres-4wdeb0zv. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance account name. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1). 
     * @return UserName Instance account name. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Instance account name. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     * @param UserName Instance account name. obtain through the api [DescribeAccounts](https://www.tencentcloud.com/document/api/409/18109?from_cn_redirect=1).
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Specifies the new password for the UserName account.
Password settings rule specifies the following:.
- valid values: 8 to 32 characters. a password with more than 12 characters is recommended.
-Must not start with "/".
-Must include the following four items:.
Lowercase letters a ~ z.
Uppercase letters: A – Z.
Digits: 0-9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/. 
     * @return Password Specifies the new password for the UserName account.
Password settings rule specifies the following:.
- valid values: 8 to 32 characters. a password with more than 12 characters is recommended.
-Must not start with "/".
-Must include the following four items:.
Lowercase letters a ~ z.
Uppercase letters: A – Z.
Digits: 0-9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Specifies the new password for the UserName account.
Password settings rule specifies the following:.
- valid values: 8 to 32 characters. a password with more than 12 characters is recommended.
-Must not start with "/".
-Must include the following four items:.
Lowercase letters a ~ z.
Uppercase letters: A – Z.
Digits: 0-9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.
     * @param Password Specifies the new password for the UserName account.
Password settings rule specifies the following:.
- valid values: 8 to 32 characters. a password with more than 12 characters is recommended.
-Must not start with "/".
-Must include the following four items:.
Lowercase letters a ~ z.
Uppercase letters: A – Z.
Digits: 0-9.
Special symbols: ()`~!@#$%^&*-+=_|{}[]:<>,.?/.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ResetAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetAccountPasswordRequest(ResetAccountPasswordRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

