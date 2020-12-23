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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMailProfileRequest extends AbstractModel{

    /**
    * The content of email configuration.
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). The email of database inspection report is configured as the user level, and the email of scheduled task report is configured as the instance level.
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * Name configuration, which needs to be unique. The email configuration name of database inspection report can be customize; the email configuration name of scheduled task report should in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID bound to the configuration, which is set when the configuration level is "Instance".
    */
    @SerializedName("BindInstanceIds")
    @Expose
    private String [] BindInstanceIds;

    /**
     * Get The content of email configuration. 
     * @return ProfileInfo The content of email configuration.
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set The content of email configuration.
     * @param ProfileInfo The content of email configuration.
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    /**
     * Get Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). The email of database inspection report is configured as the user level, and the email of scheduled task report is configured as the instance level. 
     * @return ProfileLevel Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). The email of database inspection report is configured as the user level, and the email of scheduled task report is configured as the instance level.
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). The email of database inspection report is configured as the user level, and the email of scheduled task report is configured as the instance level.
     * @param ProfileLevel Configuration level. Valid values: "User" (user-level), "Instance" (instance-level). The email of database inspection report is configured as the user level, and the email of scheduled task report is configured as the instance level.
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get Name configuration, which needs to be unique. The email configuration name of database inspection report can be customize; the email configuration name of scheduled task report should in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test". 
     * @return ProfileName Name configuration, which needs to be unique. The email configuration name of database inspection report can be customize; the email configuration name of scheduled task report should in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Name configuration, which needs to be unique. The email configuration name of database inspection report can be customize; the email configuration name of scheduled task report should in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     * @param ProfileName Name configuration, which needs to be unique. The email configuration name of database inspection report can be customize; the email configuration name of scheduled task report should in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report). 
     * @return ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     * @param ProfileType Configuration type. Valid values: "dbScan_mail_configuration" (email configuration of database inspection report), "scheduler_mail_configuration" (email configuration of scheduled task report).
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)). 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TencentDB for CynosDB (compatible with MySQL)).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance ID bound to the configuration, which is set when the configuration level is "Instance". 
     * @return BindInstanceIds Instance ID bound to the configuration, which is set when the configuration level is "Instance".
     */
    public String [] getBindInstanceIds() {
        return this.BindInstanceIds;
    }

    /**
     * Set Instance ID bound to the configuration, which is set when the configuration level is "Instance".
     * @param BindInstanceIds Instance ID bound to the configuration, which is set when the configuration level is "Instance".
     */
    public void setBindInstanceIds(String [] BindInstanceIds) {
        this.BindInstanceIds = BindInstanceIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);
        this.setParamSimple(map, prefix + "ProfileLevel", this.ProfileLevel);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "BindInstanceIds.", this.BindInstanceIds);

    }
}

