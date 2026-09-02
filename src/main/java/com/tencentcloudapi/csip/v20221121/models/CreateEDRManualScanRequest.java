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

public class CreateEDRManualScanRequest extends AbstractModel {

    /**
    * <p>Asset selection method: all - all assets/tag - select by tag (hosts only)/direct - direct selection</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>Detection mode: full - full-disk detection / quick - rapid detection / include - detect specified paths only / exclude - exclude specified paths</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Directly selected host list (used when AssetSelectionType=direct or all)</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>Host list for removal (used when AssetSelectionType=all)</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>Tag ID corresponding to the host</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>Cluster list for direct selection</p>
    */
    @SerializedName("ClusterIDsWithAppId")
    @Expose
    private ClusterWithAppIdItem [] ClusterIDsWithAppId;

    /**
    * <p>Cluster list for removal (used when AssetSelectionType=all)</p>
    */
    @SerializedName("ExcludeClusterIDsWithAppId")
    @Expose
    private ClusterWithAppIdItem [] ExcludeClusterIDsWithAppId;

    /**
    * <p>Selected path list (required when ScanType is include or exclude, up to 100 entries)</p>
    */
    @SerializedName("CustomPaths")
    @Expose
    private String [] CustomPaths;

    /**
    * <p>Timeout period in seconds, upper limit 7200</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Whether deep detection is enabled: 0-No/1-Yes</p>
    */
    @SerializedName("EnableMemShellScan")
    @Expose
    private Long EnableMemShellScan;

    /**
     * Get <p>Asset selection method: all - all assets/tag - select by tag (hosts only)/direct - direct selection</p> 
     * @return AssetSelectionType <p>Asset selection method: all - all assets/tag - select by tag (hosts only)/direct - direct selection</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>Asset selection method: all - all assets/tag - select by tag (hosts only)/direct - direct selection</p>
     * @param AssetSelectionType <p>Asset selection method: all - all assets/tag - select by tag (hosts only)/direct - direct selection</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>Detection mode: full - full-disk detection / quick - rapid detection / include - detect specified paths only / exclude - exclude specified paths</p> 
     * @return ScanType <p>Detection mode: full - full-disk detection / quick - rapid detection / include - detect specified paths only / exclude - exclude specified paths</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>Detection mode: full - full-disk detection / quick - rapid detection / include - detect specified paths only / exclude - exclude specified paths</p>
     * @param ScanType <p>Detection mode: full - full-disk detection / quick - rapid detection / include - detect specified paths only / exclude - exclude specified paths</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

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
     * Get <p>Directly selected host list (used when AssetSelectionType=direct or all)</p> 
     * @return InstanceIDsWithAppId <p>Directly selected host list (used when AssetSelectionType=direct or all)</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>Directly selected host list (used when AssetSelectionType=direct or all)</p>
     * @param InstanceIDsWithAppId <p>Directly selected host list (used when AssetSelectionType=direct or all)</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>Host list for removal (used when AssetSelectionType=all)</p> 
     * @return ExcludeInstanceIDsWithAppId <p>Host list for removal (used when AssetSelectionType=all)</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>Host list for removal (used when AssetSelectionType=all)</p>
     * @param ExcludeInstanceIDsWithAppId <p>Host list for removal (used when AssetSelectionType=all)</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>Tag ID corresponding to the host</p> 
     * @return TagIds <p>Tag ID corresponding to the host</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>Tag ID corresponding to the host</p>
     * @param TagIds <p>Tag ID corresponding to the host</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>Cluster list for direct selection</p> 
     * @return ClusterIDsWithAppId <p>Cluster list for direct selection</p>
     */
    public ClusterWithAppIdItem [] getClusterIDsWithAppId() {
        return this.ClusterIDsWithAppId;
    }

    /**
     * Set <p>Cluster list for direct selection</p>
     * @param ClusterIDsWithAppId <p>Cluster list for direct selection</p>
     */
    public void setClusterIDsWithAppId(ClusterWithAppIdItem [] ClusterIDsWithAppId) {
        this.ClusterIDsWithAppId = ClusterIDsWithAppId;
    }

    /**
     * Get <p>Cluster list for removal (used when AssetSelectionType=all)</p> 
     * @return ExcludeClusterIDsWithAppId <p>Cluster list for removal (used when AssetSelectionType=all)</p>
     */
    public ClusterWithAppIdItem [] getExcludeClusterIDsWithAppId() {
        return this.ExcludeClusterIDsWithAppId;
    }

    /**
     * Set <p>Cluster list for removal (used when AssetSelectionType=all)</p>
     * @param ExcludeClusterIDsWithAppId <p>Cluster list for removal (used when AssetSelectionType=all)</p>
     */
    public void setExcludeClusterIDsWithAppId(ClusterWithAppIdItem [] ExcludeClusterIDsWithAppId) {
        this.ExcludeClusterIDsWithAppId = ExcludeClusterIDsWithAppId;
    }

    /**
     * Get <p>Selected path list (required when ScanType is include or exclude, up to 100 entries)</p> 
     * @return CustomPaths <p>Selected path list (required when ScanType is include or exclude, up to 100 entries)</p>
     */
    public String [] getCustomPaths() {
        return this.CustomPaths;
    }

    /**
     * Set <p>Selected path list (required when ScanType is include or exclude, up to 100 entries)</p>
     * @param CustomPaths <p>Selected path list (required when ScanType is include or exclude, up to 100 entries)</p>
     */
    public void setCustomPaths(String [] CustomPaths) {
        this.CustomPaths = CustomPaths;
    }

    /**
     * Get <p>Timeout period in seconds, upper limit 7200</p> 
     * @return Timeout <p>Timeout period in seconds, upper limit 7200</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout period in seconds, upper limit 7200</p>
     * @param Timeout <p>Timeout period in seconds, upper limit 7200</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Whether deep detection is enabled: 0-No/1-Yes</p> 
     * @return EnableMemShellScan <p>Whether deep detection is enabled: 0-No/1-Yes</p>
     */
    public Long getEnableMemShellScan() {
        return this.EnableMemShellScan;
    }

    /**
     * Set <p>Whether deep detection is enabled: 0-No/1-Yes</p>
     * @param EnableMemShellScan <p>Whether deep detection is enabled: 0-No/1-Yes</p>
     */
    public void setEnableMemShellScan(Long EnableMemShellScan) {
        this.EnableMemShellScan = EnableMemShellScan;
    }

    public CreateEDRManualScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEDRManualScanRequest(CreateEDRManualScanRequest source) {
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.ClusterIDsWithAppId != null) {
            this.ClusterIDsWithAppId = new ClusterWithAppIdItem[source.ClusterIDsWithAppId.length];
            for (int i = 0; i < source.ClusterIDsWithAppId.length; i++) {
                this.ClusterIDsWithAppId[i] = new ClusterWithAppIdItem(source.ClusterIDsWithAppId[i]);
            }
        }
        if (source.ExcludeClusterIDsWithAppId != null) {
            this.ExcludeClusterIDsWithAppId = new ClusterWithAppIdItem[source.ExcludeClusterIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeClusterIDsWithAppId.length; i++) {
                this.ExcludeClusterIDsWithAppId[i] = new ClusterWithAppIdItem(source.ExcludeClusterIDsWithAppId[i]);
            }
        }
        if (source.CustomPaths != null) {
            this.CustomPaths = new String[source.CustomPaths.length];
            for (int i = 0; i < source.CustomPaths.length; i++) {
                this.CustomPaths[i] = new String(source.CustomPaths[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.EnableMemShellScan != null) {
            this.EnableMemShellScan = new Long(source.EnableMemShellScan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);
        this.setParamArraySimple(map, prefix + "CustomPaths.", this.CustomPaths);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "EnableMemShellScan", this.EnableMemShellScan);

    }
}

