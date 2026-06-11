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

public class DataTransformResouceInfo extends AbstractModel {

    /**
    * <p>Log topic ID</p><ul><li>Get the log topic ID by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">getting the log topic list</a>.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Alias<br>Limitation: Cannot contain character |.</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Whether it is a cross-account topic. false means it is not a cross-account topic, and true means it is a cross-account topic.</p><p>Default value: false</p>
    */
    @SerializedName("IsCrossAccount")
    @Expose
    private Boolean IsCrossAccount;

    /**
    * <p>In a cross-account scenario, search for the role ARN value created by the delivery account for the shipping account in the roles of the shipping account.</p>
    */
    @SerializedName("RoleARN")
    @Expose
    private String RoleARN;

    /**
    * <p>External ID value. Can be found in the role-carrier of the shipping account.</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>topic name</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Logset name</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
     * Get <p>Log topic ID</p><ul><li>Get the log topic ID by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">getting the log topic list</a>.</li></ul> 
     * @return TopicId <p>Log topic ID</p><ul><li>Get the log topic ID by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">getting the log topic list</a>.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic ID</p><ul><li>Get the log topic ID by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">getting the log topic list</a>.</li></ul>
     * @param TopicId <p>Log topic ID</p><ul><li>Get the log topic ID by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">getting the log topic list</a>.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Alias<br>Limitation: Cannot contain character |.</p> 
     * @return Alias <p>Alias<br>Limitation: Cannot contain character |.</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Alias<br>Limitation: Cannot contain character |.</p>
     * @param Alias <p>Alias<br>Limitation: Cannot contain character |.</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Whether it is a cross-account topic. false means it is not a cross-account topic, and true means it is a cross-account topic.</p><p>Default value: false</p> 
     * @return IsCrossAccount <p>Whether it is a cross-account topic. false means it is not a cross-account topic, and true means it is a cross-account topic.</p><p>Default value: false</p>
     */
    public Boolean getIsCrossAccount() {
        return this.IsCrossAccount;
    }

    /**
     * Set <p>Whether it is a cross-account topic. false means it is not a cross-account topic, and true means it is a cross-account topic.</p><p>Default value: false</p>
     * @param IsCrossAccount <p>Whether it is a cross-account topic. false means it is not a cross-account topic, and true means it is a cross-account topic.</p><p>Default value: false</p>
     */
    public void setIsCrossAccount(Boolean IsCrossAccount) {
        this.IsCrossAccount = IsCrossAccount;
    }

    /**
     * Get <p>In a cross-account scenario, search for the role ARN value created by the delivery account for the shipping account in the roles of the shipping account.</p> 
     * @return RoleARN <p>In a cross-account scenario, search for the role ARN value created by the delivery account for the shipping account in the roles of the shipping account.</p>
     */
    public String getRoleARN() {
        return this.RoleARN;
    }

    /**
     * Set <p>In a cross-account scenario, search for the role ARN value created by the delivery account for the shipping account in the roles of the shipping account.</p>
     * @param RoleARN <p>In a cross-account scenario, search for the role ARN value created by the delivery account for the shipping account in the roles of the shipping account.</p>
     */
    public void setRoleARN(String RoleARN) {
        this.RoleARN = RoleARN;
    }

    /**
     * Get <p>External ID value. Can be found in the role-carrier of the shipping account.</p> 
     * @return ExternalId <p>External ID value. Can be found in the role-carrier of the shipping account.</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>External ID value. Can be found in the role-carrier of the shipping account.</p>
     * @param ExternalId <p>External ID value. Can be found in the role-carrier of the shipping account.</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>topic name</p> 
     * @return TopicName <p>topic name</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>topic name</p>
     * @param TopicName <p>topic name</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Logset name</p> 
     * @return LogsetName <p>Logset name</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>Logset name</p>
     * @param LogsetName <p>Logset name</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    public DataTransformResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformResouceInfo(DataTransformResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.IsCrossAccount != null) {
            this.IsCrossAccount = new Boolean(source.IsCrossAccount);
        }
        if (source.RoleARN != null) {
            this.RoleARN = new String(source.RoleARN);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "IsCrossAccount", this.IsCrossAccount);
        this.setParamSimple(map, prefix + "RoleARN", this.RoleARN);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);

    }
}

