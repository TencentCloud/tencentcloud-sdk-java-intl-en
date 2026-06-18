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

public class CreateRiskCenterScanTaskRequest extends AbstractModel {

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets). When `ScanAssetType=1/2`, `Assets` is required. When `ScanAssetType=3`, `SelfDefiningAssets` is required. 
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * Project to scan: port/poc/weakpass/webcontent/configrisk/exposedserver
    */
    @SerializedName("ScanItem")
    @Expose
    private String [] ScanItem;

    /**
    * Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. When ScanPlanType=0,2,3, `ScanPlanContent` is required.
    */
    @SerializedName("ScanPlanType")
    @Expose
    private Long ScanPlanType;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * List of assets to scan
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * Details of a scheduled scan task
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * IP/Domain name/URL
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * Request initiation source, vss means vulnerability scan service, the user of CSC fill in csip, default csip
    */
    @SerializedName("ScanFrom")
    @Expose
    private String ScanFrom;

    /**
    * Advanced settings
    */
    @SerializedName("TaskAdvanceCFG")
    @Expose
    private TaskAdvanceCFG TaskAdvanceCFG;

    /**
    * Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). Default: `0`
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Asset tags
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag Tags;

    /**
    * Task completed callback webhook url
    */
    @SerializedName("FinishWebHook")
    @Expose
    private String FinishWebHook;

    /**
     * Get Task name 
     * @return TaskName Task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
     * @param TaskName Task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets). When `ScanAssetType=1/2`, `Assets` is required. When `ScanAssetType=3`, `SelfDefiningAssets` is required.  
     * @return ScanAssetType Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets). When `ScanAssetType=1/2`, `Assets` is required. When `ScanAssetType=3`, `SelfDefiningAssets` is required. 
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets). When `ScanAssetType=1/2`, `Assets` is required. When `ScanAssetType=3`, `SelfDefiningAssets` is required. 
     * @param ScanAssetType Values: `0` (Scan all); `1` (Scan specific assets); `2` (Scan all expect the specified assets); `3` (Custom assets). When `ScanAssetType=1/2`, `Assets` is required. When `ScanAssetType=3`, `SelfDefiningAssets` is required. 
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get Project to scan: port/poc/weakpass/webcontent/configrisk/exposedserver 
     * @return ScanItem Project to scan: port/poc/weakpass/webcontent/configrisk/exposedserver
     */
    public String [] getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set Project to scan: port/poc/weakpass/webcontent/configrisk/exposedserver
     * @param ScanItem Project to scan: port/poc/weakpass/webcontent/configrisk/exposedserver
     */
    public void setScanItem(String [] ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. When ScanPlanType=0,2,3, `ScanPlanContent` is required. 
     * @return ScanPlanType Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. When ScanPlanType=0,2,3, `ScanPlanContent` is required.
     */
    public Long getScanPlanType() {
        return this.ScanPlanType;
    }

    /**
     * Set Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. When ScanPlanType=0,2,3, `ScanPlanContent` is required.
     * @param ScanPlanType Task type. `0`: Scheduled task, `1`: Scan immediately; `2`: Scanned at the specified time; `3`: Custom. When ScanPlanType=0,2,3, `ScanPlanContent` is required.
     */
    public void setScanPlanType(Long ScanPlanType) {
        this.ScanPlanType = ScanPlanType;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get List of assets to scan 
     * @return Assets List of assets to scan
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set List of assets to scan
     * @param Assets List of assets to scan
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get Details of a scheduled scan task 
     * @return ScanPlanContent Details of a scheduled scan task
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set Details of a scheduled scan task
     * @param ScanPlanContent Details of a scheduled scan task
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get IP/Domain name/URL 
     * @return SelfDefiningAssets IP/Domain name/URL
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set IP/Domain name/URL
     * @param SelfDefiningAssets IP/Domain name/URL
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get Request initiation source, vss means vulnerability scan service, the user of CSC fill in csip, default csip 
     * @return ScanFrom Request initiation source, vss means vulnerability scan service, the user of CSC fill in csip, default csip
     */
    public String getScanFrom() {
        return this.ScanFrom;
    }

    /**
     * Set Request initiation source, vss means vulnerability scan service, the user of CSC fill in csip, default csip
     * @param ScanFrom Request initiation source, vss means vulnerability scan service, the user of CSC fill in csip, default csip
     */
    public void setScanFrom(String ScanFrom) {
        this.ScanFrom = ScanFrom;
    }

    /**
     * Get Advanced settings 
     * @return TaskAdvanceCFG Advanced settings
     */
    public TaskAdvanceCFG getTaskAdvanceCFG() {
        return this.TaskAdvanceCFG;
    }

    /**
     * Set Advanced settings
     * @param TaskAdvanceCFG Advanced settings
     */
    public void setTaskAdvanceCFG(TaskAdvanceCFG TaskAdvanceCFG) {
        this.TaskAdvanceCFG = TaskAdvanceCFG;
    }

    /**
     * Get Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). Default: `0` 
     * @return TaskMode Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). Default: `0`
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). Default: `0`
     * @param TaskMode Scan task mode: `0` (Standard), `1` (Quick), `2` (Advanced). Default: `0`
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Asset tags 
     * @return Tags Asset tags
     */
    public AssetTag getTags() {
        return this.Tags;
    }

    /**
     * Set Asset tags
     * @param Tags Asset tags
     */
    public void setTags(AssetTag Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Task completed callback webhook url 
     * @return FinishWebHook Task completed callback webhook url
     */
    public String getFinishWebHook() {
        return this.FinishWebHook;
    }

    /**
     * Set Task completed callback webhook url
     * @param FinishWebHook Task completed callback webhook url
     */
    public void setFinishWebHook(String FinishWebHook) {
        this.FinishWebHook = FinishWebHook;
    }

    public CreateRiskCenterScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskCenterScanTaskRequest(CreateRiskCenterScanTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ScanAssetType != null) {
            this.ScanAssetType = new Long(source.ScanAssetType);
        }
        if (source.ScanItem != null) {
            this.ScanItem = new String[source.ScanItem.length];
            for (int i = 0; i < source.ScanItem.length; i++) {
                this.ScanItem[i] = new String(source.ScanItem[i]);
            }
        }
        if (source.ScanPlanType != null) {
            this.ScanPlanType = new Long(source.ScanPlanType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Assets != null) {
            this.Assets = new TaskAssetObject[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new TaskAssetObject(source.Assets[i]);
            }
        }
        if (source.ScanPlanContent != null) {
            this.ScanPlanContent = new String(source.ScanPlanContent);
        }
        if (source.SelfDefiningAssets != null) {
            this.SelfDefiningAssets = new String[source.SelfDefiningAssets.length];
            for (int i = 0; i < source.SelfDefiningAssets.length; i++) {
                this.SelfDefiningAssets[i] = new String(source.SelfDefiningAssets[i]);
            }
        }
        if (source.ScanFrom != null) {
            this.ScanFrom = new String(source.ScanFrom);
        }
        if (source.TaskAdvanceCFG != null) {
            this.TaskAdvanceCFG = new TaskAdvanceCFG(source.TaskAdvanceCFG);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag(source.Tags);
        }
        if (source.FinishWebHook != null) {
            this.FinishWebHook = new String(source.FinishWebHook);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ScanAssetType", this.ScanAssetType);
        this.setParamArraySimple(map, prefix + "ScanItem.", this.ScanItem);
        this.setParamSimple(map, prefix + "ScanPlanType", this.ScanPlanType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamSimple(map, prefix + "ScanPlanContent", this.ScanPlanContent);
        this.setParamArraySimple(map, prefix + "SelfDefiningAssets.", this.SelfDefiningAssets);
        this.setParamSimple(map, prefix + "ScanFrom", this.ScanFrom);
        this.setParamObj(map, prefix + "TaskAdvanceCFG.", this.TaskAdvanceCFG);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "FinishWebHook", this.FinishWebHook);

    }
}

