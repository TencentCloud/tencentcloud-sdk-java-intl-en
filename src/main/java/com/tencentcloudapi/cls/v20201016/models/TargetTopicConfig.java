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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetTopicConfig extends AbstractModel {

    /**
    * <p>Target account type.</p><p>Enumeration values:</p><ul><li>1: Current root account</li><li>2: Other root account</li></ul>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>Target region</p><p>Parameter format: ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Target logset id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Target log topic id.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Role ARN</p><p>Required when AccountType=2</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>External ID</p><p>Required when AccountType=2</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get <p>Target account type.</p><p>Enumeration values:</p><ul><li>1: Current root account</li><li>2: Other root account</li></ul> 
     * @return AccountType <p>Target account type.</p><p>Enumeration values:</p><ul><li>1: Current root account</li><li>2: Other root account</li></ul>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>Target account type.</p><p>Enumeration values:</p><ul><li>1: Current root account</li><li>2: Other root account</li></ul>
     * @param AccountType <p>Target account type.</p><p>Enumeration values:</p><ul><li>1: Current root account</li><li>2: Other root account</li></ul>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>Target region</p><p>Parameter format: ap-guangzhou</p> 
     * @return Region <p>Target region</p><p>Parameter format: ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Target region</p><p>Parameter format: ap-guangzhou</p>
     * @param Region <p>Target region</p><p>Parameter format: ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Target logset id</p> 
     * @return LogsetId <p>Target logset id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Target logset id</p>
     * @param LogsetId <p>Target logset id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Target log topic id.</p> 
     * @return TopicId <p>Target log topic id.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Target log topic id.</p>
     * @param TopicId <p>Target log topic id.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Role ARN</p><p>Required when AccountType=2</p> 
     * @return RoleArn <p>Role ARN</p><p>Required when AccountType=2</p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>Role ARN</p><p>Required when AccountType=2</p>
     * @param RoleArn <p>Role ARN</p><p>Required when AccountType=2</p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>External ID</p><p>Required when AccountType=2</p> 
     * @return ExternalId <p>External ID</p><p>Required when AccountType=2</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>External ID</p><p>Required when AccountType=2</p>
     * @param ExternalId <p>External ID</p><p>Required when AccountType=2</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public TargetTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetTopicConfig(TargetTopicConfig source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

