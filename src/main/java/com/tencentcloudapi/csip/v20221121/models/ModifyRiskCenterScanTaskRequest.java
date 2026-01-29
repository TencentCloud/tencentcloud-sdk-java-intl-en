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

public class ModifyRiskCenterScanTaskRequest extends AbstractModel {

    /**
    * Task name.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 0: Full Scan; 1: Specified Asset Scan; 2: Excluded Asset Scan; 3: Manual Entry Scan. 1 and 2 require the Assets field; 3 requires SelfDefiningAssets.
    */
    @SerializedName("ScanAssetType")
    @Expose
    private Long ScanAssetType;

    /**
    * Scan items. port/poc/weakpass/webcontent/configrisk
    */
    @SerializedName("ScanItem")
    @Expose
    private String [] ScanItem;

    /**
    * 0: Periodic Task; 1: Scan Now; 2: Scheduled Scan; 3: Custom. If 0, 2, 3, ScanPlanContent is required.
    */
    @SerializedName("ScanPlanType")
    @Expose
    private Long ScanPlanType;

    /**
    * Task ID to be Modified
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Scanned Asset Information List
    */
    @SerializedName("Assets")
    @Expose
    private TaskAssetObject [] Assets;

    /**
    * Scan Plan Details
    */
    @SerializedName("ScanPlanContent")
    @Expose
    private String ScanPlanContent;

    /**
    * IP/Domain/URL Array
    */
    @SerializedName("SelfDefiningAssets")
    @Expose
    private String [] SelfDefiningAssets;

    /**
    * Advanced configuration.
    */
    @SerializedName("TaskAdvanceCFG")
    @Expose
    private TaskAdvanceCFG TaskAdvanceCFG;

    /**
    * Checkup Mode. 0: Standard Mode; 1: Quick Mode; 2: Advanced Mode. Standard Mode by default.
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * Task complete callback webhook url.
    */
    @SerializedName("FinishWebHook")
    @Expose
    private String FinishWebHook;

    /**
     * Get Task name. 
     * @return TaskName Task name.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
     * @param TaskName Task name.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 0: Full Scan; 1: Specified Asset Scan; 2: Excluded Asset Scan; 3: Manual Entry Scan. 1 and 2 require the Assets field; 3 requires SelfDefiningAssets. 
     * @return ScanAssetType 0: Full Scan; 1: Specified Asset Scan; 2: Excluded Asset Scan; 3: Manual Entry Scan. 1 and 2 require the Assets field; 3 requires SelfDefiningAssets.
     */
    public Long getScanAssetType() {
        return this.ScanAssetType;
    }

    /**
     * Set 0: Full Scan; 1: Specified Asset Scan; 2: Excluded Asset Scan; 3: Manual Entry Scan. 1 and 2 require the Assets field; 3 requires SelfDefiningAssets.
     * @param ScanAssetType 0: Full Scan; 1: Specified Asset Scan; 2: Excluded Asset Scan; 3: Manual Entry Scan. 1 and 2 require the Assets field; 3 requires SelfDefiningAssets.
     */
    public void setScanAssetType(Long ScanAssetType) {
        this.ScanAssetType = ScanAssetType;
    }

    /**
     * Get Scan items. port/poc/weakpass/webcontent/configrisk 
     * @return ScanItem Scan items. port/poc/weakpass/webcontent/configrisk
     */
    public String [] getScanItem() {
        return this.ScanItem;
    }

    /**
     * Set Scan items. port/poc/weakpass/webcontent/configrisk
     * @param ScanItem Scan items. port/poc/weakpass/webcontent/configrisk
     */
    public void setScanItem(String [] ScanItem) {
        this.ScanItem = ScanItem;
    }

    /**
     * Get 0: Periodic Task; 1: Scan Now; 2: Scheduled Scan; 3: Custom. If 0, 2, 3, ScanPlanContent is required. 
     * @return ScanPlanType 0: Periodic Task; 1: Scan Now; 2: Scheduled Scan; 3: Custom. If 0, 2, 3, ScanPlanContent is required.
     */
    public Long getScanPlanType() {
        return this.ScanPlanType;
    }

    /**
     * Set 0: Periodic Task; 1: Scan Now; 2: Scheduled Scan; 3: Custom. If 0, 2, 3, ScanPlanContent is required.
     * @param ScanPlanType 0: Periodic Task; 1: Scan Now; 2: Scheduled Scan; 3: Custom. If 0, 2, 3, ScanPlanContent is required.
     */
    public void setScanPlanType(Long ScanPlanType) {
        this.ScanPlanType = ScanPlanType;
    }

    /**
     * Get Task ID to be Modified 
     * @return TaskId Task ID to be Modified
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID to be Modified
     * @param TaskId Task ID to be Modified
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
     * Get Scanned Asset Information List 
     * @return Assets Scanned Asset Information List
     */
    public TaskAssetObject [] getAssets() {
        return this.Assets;
    }

    /**
     * Set Scanned Asset Information List
     * @param Assets Scanned Asset Information List
     */
    public void setAssets(TaskAssetObject [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get Scan Plan Details 
     * @return ScanPlanContent Scan Plan Details
     */
    public String getScanPlanContent() {
        return this.ScanPlanContent;
    }

    /**
     * Set Scan Plan Details
     * @param ScanPlanContent Scan Plan Details
     */
    public void setScanPlanContent(String ScanPlanContent) {
        this.ScanPlanContent = ScanPlanContent;
    }

    /**
     * Get IP/Domain/URL Array 
     * @return SelfDefiningAssets IP/Domain/URL Array
     */
    public String [] getSelfDefiningAssets() {
        return this.SelfDefiningAssets;
    }

    /**
     * Set IP/Domain/URL Array
     * @param SelfDefiningAssets IP/Domain/URL Array
     */
    public void setSelfDefiningAssets(String [] SelfDefiningAssets) {
        this.SelfDefiningAssets = SelfDefiningAssets;
    }

    /**
     * Get Advanced configuration. 
     * @return TaskAdvanceCFG Advanced configuration.
     */
    public TaskAdvanceCFG getTaskAdvanceCFG() {
        return this.TaskAdvanceCFG;
    }

    /**
     * Set Advanced configuration.
     * @param TaskAdvanceCFG Advanced configuration.
     */
    public void setTaskAdvanceCFG(TaskAdvanceCFG TaskAdvanceCFG) {
        this.TaskAdvanceCFG = TaskAdvanceCFG;
    }

    /**
     * Get Checkup Mode. 0: Standard Mode; 1: Quick Mode; 2: Advanced Mode. Standard Mode by default. 
     * @return TaskMode Checkup Mode. 0: Standard Mode; 1: Quick Mode; 2: Advanced Mode. Standard Mode by default.
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set Checkup Mode. 0: Standard Mode; 1: Quick Mode; 2: Advanced Mode. Standard Mode by default.
     * @param TaskMode Checkup Mode. 0: Standard Mode; 1: Quick Mode; 2: Advanced Mode. Standard Mode by default.
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get Task complete callback webhook url. 
     * @return FinishWebHook Task complete callback webhook url.
     */
    public String getFinishWebHook() {
        return this.FinishWebHook;
    }

    /**
     * Set Task complete callback webhook url.
     * @param FinishWebHook Task complete callback webhook url.
     */
    public void setFinishWebHook(String FinishWebHook) {
        this.FinishWebHook = FinishWebHook;
    }

    public ModifyRiskCenterScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskCenterScanTaskRequest(ModifyRiskCenterScanTaskRequest source) {
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
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        if (source.TaskAdvanceCFG != null) {
            this.TaskAdvanceCFG = new TaskAdvanceCFG(source.TaskAdvanceCFG);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamSimple(map, prefix + "ScanPlanContent", this.ScanPlanContent);
        this.setParamArraySimple(map, prefix + "SelfDefiningAssets.", this.SelfDefiningAssets);
        this.setParamObj(map, prefix + "TaskAdvanceCFG.", this.TaskAdvanceCFG);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "FinishWebHook", this.FinishWebHook);

    }
}

