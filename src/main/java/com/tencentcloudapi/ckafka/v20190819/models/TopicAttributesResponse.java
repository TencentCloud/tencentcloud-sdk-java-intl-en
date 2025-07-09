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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicAttributesResponse extends AbstractModel {

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Topic remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Number of partitions
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * IP allowlist switch. 1: enabled, 0: disabled
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * IP allowlist list
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * Topic configuration array
    */
    @SerializedName("Config")
    @Expose
    private Config Config;

    /**
    * Partition details
    */
    @SerializedName("Partitions")
    @Expose
    private TopicPartitionDO [] Partitions;

    /**
    * Switch of the preset ACL rule. `1`: enable, `0`: disable.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableAclRule")
    @Expose
    private Long EnableAclRule;

    /**
    * Preset ACL rule list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("AclRuleList")
    @Expose
    private AclRule [] AclRuleList;

    /**
    * Traffic throttling policy in topic dimension.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("QuotaConfig")
    @Expose
    private InstanceQuotaConfigResp QuotaConfig;

    /**
    * Number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Topic remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Note Topic remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Topic remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Note Topic remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Number of partitions 
     * @return PartitionNum Number of partitions
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions
     * @param PartitionNum Number of partitions
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get IP allowlist switch. 1: enabled, 0: disabled 
     * @return EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP allowlist switch. 1: enabled, 0: disabled
     * @param EnableWhiteList IP allowlist switch. 1: enabled, 0: disabled
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get IP allowlist list 
     * @return IpWhiteList IP allowlist list
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP allowlist list
     * @param IpWhiteList IP allowlist list
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get Topic configuration array 
     * @return Config Topic configuration array
     */
    public Config getConfig() {
        return this.Config;
    }

    /**
     * Set Topic configuration array
     * @param Config Topic configuration array
     */
    public void setConfig(Config Config) {
        this.Config = Config;
    }

    /**
     * Get Partition details 
     * @return Partitions Partition details
     */
    public TopicPartitionDO [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition details
     * @param Partitions Partition details
     */
    public void setPartitions(TopicPartitionDO [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Switch of the preset ACL rule. `1`: enable, `0`: disable.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return EnableAclRule Switch of the preset ACL rule. `1`: enable, `0`: disable.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public Long getEnableAclRule() {
        return this.EnableAclRule;
    }

    /**
     * Set Switch of the preset ACL rule. `1`: enable, `0`: disable.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param EnableAclRule Switch of the preset ACL rule. `1`: enable, `0`: disable.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setEnableAclRule(Long EnableAclRule) {
        this.EnableAclRule = EnableAclRule;
    }

    /**
     * Get Preset ACL rule list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return AclRuleList Preset ACL rule list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public AclRule [] getAclRuleList() {
        return this.AclRuleList;
    }

    /**
     * Set Preset ACL rule list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param AclRuleList Preset ACL rule list.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setAclRuleList(AclRule [] AclRuleList) {
        this.AclRuleList = AclRuleList;
    }

    /**
     * Get Traffic throttling policy in topic dimension.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return QuotaConfig Traffic throttling policy in topic dimension.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public InstanceQuotaConfigResp getQuotaConfig() {
        return this.QuotaConfig;
    }

    /**
     * Set Traffic throttling policy in topic dimension.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param QuotaConfig Traffic throttling policy in topic dimension.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setQuotaConfig(InstanceQuotaConfigResp QuotaConfig) {
        this.QuotaConfig = QuotaConfig;
    }

    /**
     * Get Number of replicas
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReplicaNum Number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReplicaNum Number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    public TopicAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicAttributesResponse(TopicAttributesResponse source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.EnableWhiteList != null) {
            this.EnableWhiteList = new Long(source.EnableWhiteList);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new Config(source.Config);
        }
        if (source.Partitions != null) {
            this.Partitions = new TopicPartitionDO[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new TopicPartitionDO(source.Partitions[i]);
            }
        }
        if (source.EnableAclRule != null) {
            this.EnableAclRule = new Long(source.EnableAclRule);
        }
        if (source.AclRuleList != null) {
            this.AclRuleList = new AclRule[source.AclRuleList.length];
            for (int i = 0; i < source.AclRuleList.length; i++) {
                this.AclRuleList[i] = new AclRule(source.AclRuleList[i]);
            }
        }
        if (source.QuotaConfig != null) {
            this.QuotaConfig = new InstanceQuotaConfigResp(source.QuotaConfig);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "EnableAclRule", this.EnableAclRule);
        this.setParamArrayObj(map, prefix + "AclRuleList.", this.AclRuleList);
        this.setParamObj(map, prefix + "QuotaConfig.", this.QuotaConfig);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);

    }
}

