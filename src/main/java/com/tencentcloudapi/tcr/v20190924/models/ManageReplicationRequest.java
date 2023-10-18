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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageReplicationRequest extends AbstractModel {

    /**
    * Source instance ID
    */
    @SerializedName("SourceRegistryId")
    @Expose
    private String SourceRegistryId;

    /**
    * Destination instance ID
    */
    @SerializedName("DestinationRegistryId")
    @Expose
    private String DestinationRegistryId;

    /**
    * Synchronization rule
    */
    @SerializedName("Rule")
    @Expose
    private ReplicationRule Rule;

    /**
    * Rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Region ID of the destination instance. For example, `1` represents Guangzhou
    */
    @SerializedName("DestinationRegionId")
    @Expose
    private Long DestinationRegionId;

    /**
    * Configuration of the synchronization rule
    */
    @SerializedName("PeerReplicationOption")
    @Expose
    private PeerReplicationOption PeerReplicationOption;

    /**
     * Get Source instance ID 
     * @return SourceRegistryId Source instance ID
     */
    public String getSourceRegistryId() {
        return this.SourceRegistryId;
    }

    /**
     * Set Source instance ID
     * @param SourceRegistryId Source instance ID
     */
    public void setSourceRegistryId(String SourceRegistryId) {
        this.SourceRegistryId = SourceRegistryId;
    }

    /**
     * Get Destination instance ID 
     * @return DestinationRegistryId Destination instance ID
     */
    public String getDestinationRegistryId() {
        return this.DestinationRegistryId;
    }

    /**
     * Set Destination instance ID
     * @param DestinationRegistryId Destination instance ID
     */
    public void setDestinationRegistryId(String DestinationRegistryId) {
        this.DestinationRegistryId = DestinationRegistryId;
    }

    /**
     * Get Synchronization rule 
     * @return Rule Synchronization rule
     */
    public ReplicationRule getRule() {
        return this.Rule;
    }

    /**
     * Set Synchronization rule
     * @param Rule Synchronization rule
     */
    public void setRule(ReplicationRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Rule description 
     * @return Description Rule description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
     * @param Description Rule description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Region ID of the destination instance. For example, `1` represents Guangzhou 
     * @return DestinationRegionId Region ID of the destination instance. For example, `1` represents Guangzhou
     */
    public Long getDestinationRegionId() {
        return this.DestinationRegionId;
    }

    /**
     * Set Region ID of the destination instance. For example, `1` represents Guangzhou
     * @param DestinationRegionId Region ID of the destination instance. For example, `1` represents Guangzhou
     */
    public void setDestinationRegionId(Long DestinationRegionId) {
        this.DestinationRegionId = DestinationRegionId;
    }

    /**
     * Get Configuration of the synchronization rule 
     * @return PeerReplicationOption Configuration of the synchronization rule
     */
    public PeerReplicationOption getPeerReplicationOption() {
        return this.PeerReplicationOption;
    }

    /**
     * Set Configuration of the synchronization rule
     * @param PeerReplicationOption Configuration of the synchronization rule
     */
    public void setPeerReplicationOption(PeerReplicationOption PeerReplicationOption) {
        this.PeerReplicationOption = PeerReplicationOption;
    }

    public ManageReplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageReplicationRequest(ManageReplicationRequest source) {
        if (source.SourceRegistryId != null) {
            this.SourceRegistryId = new String(source.SourceRegistryId);
        }
        if (source.DestinationRegistryId != null) {
            this.DestinationRegistryId = new String(source.DestinationRegistryId);
        }
        if (source.Rule != null) {
            this.Rule = new ReplicationRule(source.Rule);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DestinationRegionId != null) {
            this.DestinationRegionId = new Long(source.DestinationRegionId);
        }
        if (source.PeerReplicationOption != null) {
            this.PeerReplicationOption = new PeerReplicationOption(source.PeerReplicationOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceRegistryId", this.SourceRegistryId);
        this.setParamSimple(map, prefix + "DestinationRegistryId", this.DestinationRegistryId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DestinationRegionId", this.DestinationRegionId);
        this.setParamObj(map, prefix + "PeerReplicationOption.", this.PeerReplicationOption);

    }
}

