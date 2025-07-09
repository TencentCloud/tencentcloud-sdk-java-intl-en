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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBImportJobRequest extends AbstractModel {

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * TencentDB username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Filename. The file must be a .sql file uploaded to Tencent Cloud.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Password of a TencentDB instance user account
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Name of the target database. If this parameter is not passed in, no database is specified.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * URL of a .sql file stored in COS. Either `FileName` or `CosUrl` must be specified.
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get TencentDB username 
     * @return User TencentDB username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set TencentDB username
     * @param User TencentDB username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Filename. The file must be a .sql file uploaded to Tencent Cloud. 
     * @return FileName Filename. The file must be a .sql file uploaded to Tencent Cloud.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename. The file must be a .sql file uploaded to Tencent Cloud.
     * @param FileName Filename. The file must be a .sql file uploaded to Tencent Cloud.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Password of a TencentDB instance user account 
     * @return Password Password of a TencentDB instance user account
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password of a TencentDB instance user account
     * @param Password Password of a TencentDB instance user account
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Name of the target database. If this parameter is not passed in, no database is specified. 
     * @return DbName Name of the target database. If this parameter is not passed in, no database is specified.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Name of the target database. If this parameter is not passed in, no database is specified.
     * @param DbName Name of the target database. If this parameter is not passed in, no database is specified.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get URL of a .sql file stored in COS. Either `FileName` or `CosUrl` must be specified. 
     * @return CosUrl URL of a .sql file stored in COS. Either `FileName` or `CosUrl` must be specified.
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set URL of a .sql file stored in COS. Either `FileName` or `CosUrl` must be specified.
     * @param CosUrl URL of a .sql file stored in COS. Either `FileName` or `CosUrl` must be specified.
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    public CreateDBImportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBImportJobRequest(CreateDBImportJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);

    }
}

