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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicAttributesResponse extends AbstractModel{

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
    * IP whitelist switch. 1: enabled, 0: disabled
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Long EnableWhiteList;

    /**
    * IP whitelist list
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
     * Get IP whitelist switch. 1: enabled, 0: disabled 
     * @return EnableWhiteList IP whitelist switch. 1: enabled, 0: disabled
     */
    public Long getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set IP whitelist switch. 1: enabled, 0: disabled
     * @param EnableWhiteList IP whitelist switch. 1: enabled, 0: disabled
     */
    public void setEnableWhiteList(Long EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get IP whitelist list 
     * @return IpWhiteList IP whitelist list
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set IP whitelist list
     * @param IpWhiteList IP whitelist list
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

    }
}

