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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleItem extends AbstractModel {

    /**
    * Role name.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Whether to enable consumption.
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * Whether to enable production
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * Access Key
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Secret Key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Role creation time. **It is a Unix timestamp (ms).**
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Role update time. **It is a Unix timestamp (ms).**
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group level).
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * Permission configuration in Topic and Group dimension.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetailedRolePerms")
    @Expose
    private DetailedRolePerm [] DetailedRolePerms;

    /**
     * Get Role name. 
     * @return RoleName Role name.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name.
     * @param RoleName Role name.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Whether to enable consumption. 
     * @return PermRead Whether to enable consumption.
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set Whether to enable consumption.
     * @param PermRead Whether to enable consumption.
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get Whether to enable production 
     * @return PermWrite Whether to enable production
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set Whether to enable production
     * @param PermWrite Whether to enable production
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get Access Key 
     * @return AccessKey Access Key
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access Key
     * @param AccessKey Access Key
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Secret Key 
     * @return SecretKey Secret Key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Secret Key
     * @param SecretKey Secret Key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Role creation time. **It is a Unix timestamp (ms).** 
     * @return CreatedTime Role creation time. **It is a Unix timestamp (ms).**
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Role creation time. **It is a Unix timestamp (ms).**
     * @param CreatedTime Role creation time. **It is a Unix timestamp (ms).**
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Role update time. **It is a Unix timestamp (ms).** 
     * @return ModifiedTime Role update time. **It is a Unix timestamp (ms).**
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Role update time. **It is a Unix timestamp (ms).**
     * @param ModifiedTime Role update time. **It is a Unix timestamp (ms).**
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group level). 
     * @return PermType Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group level).
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group level).
     * @param PermType Specifies the types of permissions. the default is to authorize by Cluster (Cluster: at the Cluster level; TopicAndGroup: topic and consumer group level).
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get Permission configuration in Topic and Group dimension.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetailedRolePerms Permission configuration in Topic and Group dimension.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DetailedRolePerm [] getDetailedRolePerms() {
        return this.DetailedRolePerms;
    }

    /**
     * Set Permission configuration in Topic and Group dimension.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetailedRolePerms Permission configuration in Topic and Group dimension.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetailedRolePerms(DetailedRolePerm [] DetailedRolePerms) {
        this.DetailedRolePerms = DetailedRolePerms;
    }

    public RoleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleItem(RoleItem source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.DetailedRolePerms != null) {
            this.DetailedRolePerms = new DetailedRolePerm[source.DetailedRolePerms.length];
            for (int i = 0; i < source.DetailedRolePerms.length; i++) {
                this.DetailedRolePerms[i] = new DetailedRolePerm(source.DetailedRolePerms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamArrayObj(map, prefix + "DetailedRolePerms.", this.DetailedRolePerms);

    }
}

