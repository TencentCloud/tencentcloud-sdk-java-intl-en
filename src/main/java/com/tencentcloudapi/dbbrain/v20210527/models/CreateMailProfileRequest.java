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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMailProfileRequest extends AbstractModel{

    /**
    * Email configuration.
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * Configuration level. Valid values: User (user-level), Instance (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * Configuration name, which needs to be unique. For database inspection emails, this name can be customized as needed. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
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
    * Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID bound with the configuration, which is set when the configuration level is `Instance`. Only one instance can be bound at a time. When the configuration level is `User`, leave this parameter empty.
    */
    @SerializedName("BindInstanceIds")
    @Expose
    private String [] BindInstanceIds;

    /**
     * Get Email configuration. 
     * @return ProfileInfo Email configuration.
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set Email configuration.
     * @param ProfileInfo Email configuration.
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    /**
     * Get Configuration level. Valid values: User (user-level), Instance (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`. 
     * @return ProfileLevel Configuration level. Valid values: User (user-level), Instance (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set Configuration level. Valid values: User (user-level), Instance (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
     * @param ProfileLevel Configuration level. Valid values: User (user-level), Instance (instance-level). For database inspection emails, it should be `User`. For scheduled task emails, it should be `Instance`.
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get Configuration name, which needs to be unique. For database inspection emails, this name can be customized as needed. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test". 
     * @return ProfileName Configuration name, which needs to be unique. For database inspection emails, this name can be customized as needed. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Configuration name, which needs to be unique. For database inspection emails, this name can be customized as needed. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     * @param ProfileName Configuration name, which needs to be unique. For database inspection emails, this name can be customized as needed. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
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
     * Get Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). 
     * @return Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL).
     * @param Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Instance ID bound with the configuration, which is set when the configuration level is `Instance`. Only one instance can be bound at a time. When the configuration level is `User`, leave this parameter empty. 
     * @return BindInstanceIds Instance ID bound with the configuration, which is set when the configuration level is `Instance`. Only one instance can be bound at a time. When the configuration level is `User`, leave this parameter empty.
     */
    public String [] getBindInstanceIds() {
        return this.BindInstanceIds;
    }

    /**
     * Set Instance ID bound with the configuration, which is set when the configuration level is `Instance`. Only one instance can be bound at a time. When the configuration level is `User`, leave this parameter empty.
     * @param BindInstanceIds Instance ID bound with the configuration, which is set when the configuration level is `Instance`. Only one instance can be bound at a time. When the configuration level is `User`, leave this parameter empty.
     */
    public void setBindInstanceIds(String [] BindInstanceIds) {
        this.BindInstanceIds = BindInstanceIds;
    }

    public CreateMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMailProfileRequest(CreateMailProfileRequest source) {
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
        if (source.ProfileLevel != null) {
            this.ProfileLevel = new String(source.ProfileLevel);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.BindInstanceIds != null) {
            this.BindInstanceIds = new String[source.BindInstanceIds.length];
            for (int i = 0; i < source.BindInstanceIds.length; i++) {
                this.BindInstanceIds[i] = new String(source.BindInstanceIds[i]);
            }
        }
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

