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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Role extends AbstractModel {

    /**
    * <p>Role name.</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Role token value.</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Authorization type (Cluster: cluster; TopicAndGroup: topic/consumer group)</p>
    */
    @SerializedName("PermType")
    @Expose
    private String PermType;

    /**
    * <p>Role type</p><p>Enumeration value:</p><ul><li>Temporary: Rotation key</li><li>Permanent: Permanent key</li></ul>
    */
    @SerializedName("TokenType")
    @Expose
    private String TokenType;

    /**
    * <p>SSM unique ID</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>Rotation cycle</p><p>Unit: day</p>
    */
    @SerializedName("RotateFreq")
    @Expose
    private Long RotateFreq;

    /**
     * Get <p>Role name.</p> 
     * @return RoleName <p>Role name.</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Role name.</p>
     * @param RoleName <p>Role name.</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Role token value.</p> 
     * @return Token <p>Role token value.</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>Role token value.</p>
     * @param Token <p>Role token value.</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Authorization type (Cluster: cluster; TopicAndGroup: topic/consumer group)</p> 
     * @return PermType <p>Authorization type (Cluster: cluster; TopicAndGroup: topic/consumer group)</p>
     */
    public String getPermType() {
        return this.PermType;
    }

    /**
     * Set <p>Authorization type (Cluster: cluster; TopicAndGroup: topic/consumer group)</p>
     * @param PermType <p>Authorization type (Cluster: cluster; TopicAndGroup: topic/consumer group)</p>
     */
    public void setPermType(String PermType) {
        this.PermType = PermType;
    }

    /**
     * Get <p>Role type</p><p>Enumeration value:</p><ul><li>Temporary: Rotation key</li><li>Permanent: Permanent key</li></ul> 
     * @return TokenType <p>Role type</p><p>Enumeration value:</p><ul><li>Temporary: Rotation key</li><li>Permanent: Permanent key</li></ul>
     */
    public String getTokenType() {
        return this.TokenType;
    }

    /**
     * Set <p>Role type</p><p>Enumeration value:</p><ul><li>Temporary: Rotation key</li><li>Permanent: Permanent key</li></ul>
     * @param TokenType <p>Role type</p><p>Enumeration value:</p><ul><li>Temporary: Rotation key</li><li>Permanent: Permanent key</li></ul>
     */
    public void setTokenType(String TokenType) {
        this.TokenType = TokenType;
    }

    /**
     * Get <p>SSM unique ID</p> 
     * @return SecretName <p>SSM unique ID</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>SSM unique ID</p>
     * @param SecretName <p>SSM unique ID</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>Rotation cycle</p><p>Unit: day</p> 
     * @return RotateFreq <p>Rotation cycle</p><p>Unit: day</p>
     */
    public Long getRotateFreq() {
        return this.RotateFreq;
    }

    /**
     * Set <p>Rotation cycle</p><p>Unit: day</p>
     * @param RotateFreq <p>Rotation cycle</p><p>Unit: day</p>
     */
    public void setRotateFreq(Long RotateFreq) {
        this.RotateFreq = RotateFreq;
    }

    public Role() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Role(Role source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.PermType != null) {
            this.PermType = new String(source.PermType);
        }
        if (source.TokenType != null) {
            this.TokenType = new String(source.TokenType);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.RotateFreq != null) {
            this.RotateFreq = new Long(source.RotateFreq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PermType", this.PermType);
        this.setParamSimple(map, prefix + "TokenType", this.TokenType);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "RotateFreq", this.RotateFreq);

    }
}

