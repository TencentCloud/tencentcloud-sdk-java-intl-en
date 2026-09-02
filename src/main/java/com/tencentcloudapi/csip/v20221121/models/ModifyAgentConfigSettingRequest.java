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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentConfigSettingRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>List of log collection types. Available values: tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
    */
    @SerializedName("LogCollectSettings")
    @Expose
    private String [] LogCollectSettings;

    /**
    * <p>Asset selection method: all - all paid assets, tag - select by tag, direct - direct selection</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>Tag ID array used when selecting by tag (used when AssetSelectionType=tag)</p>
    */
    @SerializedName("TagIds")
    @Expose
    private String [] TagIds;

    /**
    * <p>direct selection of the host instance_id list (used when AssetSelectionType=direct)</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>Exclusion instance_id list of the host (used when AssetSelectionType=all)</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>List of log collection types. Available values: tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p> 
     * @return LogCollectSettings <p>List of log collection types. Available values: tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     */
    public String [] getLogCollectSettings() {
        return this.LogCollectSettings;
    }

    /**
     * Set <p>List of log collection types. Available values: tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     * @param LogCollectSettings <p>List of log collection types. Available values: tcp_src_port/tcp_ingress/http_egress/http_ingress/app_access</p>
     */
    public void setLogCollectSettings(String [] LogCollectSettings) {
        this.LogCollectSettings = LogCollectSettings;
    }

    /**
     * Get <p>Asset selection method: all - all paid assets, tag - select by tag, direct - direct selection</p> 
     * @return AssetSelectionType <p>Asset selection method: all - all paid assets, tag - select by tag, direct - direct selection</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>Asset selection method: all - all paid assets, tag - select by tag, direct - direct selection</p>
     * @param AssetSelectionType <p>Asset selection method: all - all paid assets, tag - select by tag, direct - direct selection</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>Tag ID array used when selecting by tag (used when AssetSelectionType=tag)</p> 
     * @return TagIds <p>Tag ID array used when selecting by tag (used when AssetSelectionType=tag)</p>
     */
    public String [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>Tag ID array used when selecting by tag (used when AssetSelectionType=tag)</p>
     * @param TagIds <p>Tag ID array used when selecting by tag (used when AssetSelectionType=tag)</p>
     */
    public void setTagIds(String [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>direct selection of the host instance_id list (used when AssetSelectionType=direct)</p> 
     * @return InstanceIDs <p>direct selection of the host instance_id list (used when AssetSelectionType=direct)</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>direct selection of the host instance_id list (used when AssetSelectionType=direct)</p>
     * @param InstanceIDs <p>direct selection of the host instance_id list (used when AssetSelectionType=direct)</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>Exclusion instance_id list of the host (used when AssetSelectionType=all)</p> 
     * @return ExcludeInstanceIDs <p>Exclusion instance_id list of the host (used when AssetSelectionType=all)</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>Exclusion instance_id list of the host (used when AssetSelectionType=all)</p>
     * @param ExcludeInstanceIDs <p>Exclusion instance_id list of the host (used when AssetSelectionType=all)</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    public ModifyAgentConfigSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentConfigSettingRequest(ModifyAgentConfigSettingRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.LogCollectSettings != null) {
            this.LogCollectSettings = new String[source.LogCollectSettings.length];
            for (int i = 0; i < source.LogCollectSettings.length; i++) {
                this.LogCollectSettings[i] = new String(source.LogCollectSettings[i]);
            }
        }
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.TagIds != null) {
            this.TagIds = new String[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new String(source.TagIds[i]);
            }
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "LogCollectSettings.", this.LogCollectSettings);
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);

    }
}

