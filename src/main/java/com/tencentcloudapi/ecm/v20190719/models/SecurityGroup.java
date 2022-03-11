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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel{

    /**
    * Security group instance ID, such as `esg-ohuuioma`.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Security group name, which can be customized with up to 60 characters.
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * Security group remarks, which can contain up to 100 characters.
    */
    @SerializedName("SecurityGroupDesc")
    @Expose
    private String SecurityGroupDesc;

    /**
    * Whether it is the default security group (which cannot be deleted).
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Security group creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Tag key-value pairs.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get Security group instance ID, such as `esg-ohuuioma`. 
     * @return SecurityGroupId Security group instance ID, such as `esg-ohuuioma`.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID, such as `esg-ohuuioma`.
     * @param SecurityGroupId Security group instance ID, such as `esg-ohuuioma`.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Security group name, which can be customized with up to 60 characters. 
     * @return SecurityGroupName Security group name, which can be customized with up to 60 characters.
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set Security group name, which can be customized with up to 60 characters.
     * @param SecurityGroupName Security group name, which can be customized with up to 60 characters.
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get Security group remarks, which can contain up to 100 characters. 
     * @return SecurityGroupDesc Security group remarks, which can contain up to 100 characters.
     */
    public String getSecurityGroupDesc() {
        return this.SecurityGroupDesc;
    }

    /**
     * Set Security group remarks, which can contain up to 100 characters.
     * @param SecurityGroupDesc Security group remarks, which can contain up to 100 characters.
     */
    public void setSecurityGroupDesc(String SecurityGroupDesc) {
        this.SecurityGroupDesc = SecurityGroupDesc;
    }

    /**
     * Get Whether it is the default security group (which cannot be deleted). 
     * @return IsDefault Whether it is the default security group (which cannot be deleted).
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default security group (which cannot be deleted).
     * @param IsDefault Whether it is the default security group (which cannot be deleted).
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Security group creation time. 
     * @return CreatedTime Security group creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Security group creation time.
     * @param CreatedTime Security group creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Tag key-value pairs. 
     * @return TagSet Tag key-value pairs.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs.
     * @param TagSet Tag key-value pairs.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupDesc != null) {
            this.SecurityGroupDesc = new String(source.SecurityGroupDesc);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDesc", this.SecurityGroupDesc);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

