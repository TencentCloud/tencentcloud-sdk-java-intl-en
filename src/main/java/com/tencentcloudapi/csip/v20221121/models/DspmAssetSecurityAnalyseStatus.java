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

public class DspmAssetSecurityAnalyseStatus extends AbstractModel {

    /**
    * app id of the asset owner account
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Asset instance ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Whether sensitive data identification is supported. 0: no support; 1: support
    */
    @SerializedName("IdentifyScanSupported")
    @Expose
    private Long IdentifyScanSupported;

    /**
    * Whether log shipping is supported. 0: unsupported; 1: supported
    */
    @SerializedName("LogDeliverySupported")
    @Expose
    private Long LogDeliverySupported;

    /**
    * Security analysis status (0: Off, 1: On, 2: Activating, 3: Disabling)

    */
    @SerializedName("SecurityAnalyseStatus")
    @Expose
    private Long SecurityAnalyseStatus;

    /**
    * Log delivery status.
0: shipping disabled; 1: shipping enabled; 2: shipping activating; 3: shipping disabling
    */
    @SerializedName("LogDeliveryStatus")
    @Expose
    private Long LogDeliveryStatus;

    /**
    * The causes for the log audit being forbidden to enable. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled
    */
    @SerializedName("LogDeliveryDisableReason")
    @Expose
    private String LogDeliveryDisableReason;

    /**
    * Total number of logs for the current instance.
    */
    @SerializedName("TotalAuditLogs")
    @Expose
    private Long TotalAuditLogs;

    /**
    * Number of recognized sensitive data items
    */
    @SerializedName("DataScanDetailRuleCount")
    @Expose
    private Long DataScanDetailRuleCount;

    /**
    * Operation error information
    */
    @SerializedName("OperationErrorMsg")
    @Expose
    private String OperationErrorMsg;

    /**
     * Get app id of the asset owner account 
     * @return AppId app id of the asset owner account
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id of the asset owner account
     * @param AppId app id of the asset owner account
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Asset instance ID. 
     * @return AssetId Asset instance ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset instance ID.
     * @param AssetId Asset instance ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Whether sensitive data identification is supported. 0: no support; 1: support 
     * @return IdentifyScanSupported Whether sensitive data identification is supported. 0: no support; 1: support
     */
    public Long getIdentifyScanSupported() {
        return this.IdentifyScanSupported;
    }

    /**
     * Set Whether sensitive data identification is supported. 0: no support; 1: support
     * @param IdentifyScanSupported Whether sensitive data identification is supported. 0: no support; 1: support
     */
    public void setIdentifyScanSupported(Long IdentifyScanSupported) {
        this.IdentifyScanSupported = IdentifyScanSupported;
    }

    /**
     * Get Whether log shipping is supported. 0: unsupported; 1: supported 
     * @return LogDeliverySupported Whether log shipping is supported. 0: unsupported; 1: supported
     */
    public Long getLogDeliverySupported() {
        return this.LogDeliverySupported;
    }

    /**
     * Set Whether log shipping is supported. 0: unsupported; 1: supported
     * @param LogDeliverySupported Whether log shipping is supported. 0: unsupported; 1: supported
     */
    public void setLogDeliverySupported(Long LogDeliverySupported) {
        this.LogDeliverySupported = LogDeliverySupported;
    }

    /**
     * Get Security analysis status (0: Off, 1: On, 2: Activating, 3: Disabling)
 
     * @return SecurityAnalyseStatus Security analysis status (0: Off, 1: On, 2: Activating, 3: Disabling)

     */
    public Long getSecurityAnalyseStatus() {
        return this.SecurityAnalyseStatus;
    }

    /**
     * Set Security analysis status (0: Off, 1: On, 2: Activating, 3: Disabling)

     * @param SecurityAnalyseStatus Security analysis status (0: Off, 1: On, 2: Activating, 3: Disabling)

     */
    public void setSecurityAnalyseStatus(Long SecurityAnalyseStatus) {
        this.SecurityAnalyseStatus = SecurityAnalyseStatus;
    }

    /**
     * Get Log delivery status.
0: shipping disabled; 1: shipping enabled; 2: shipping activating; 3: shipping disabling 
     * @return LogDeliveryStatus Log delivery status.
0: shipping disabled; 1: shipping enabled; 2: shipping activating; 3: shipping disabling
     */
    public Long getLogDeliveryStatus() {
        return this.LogDeliveryStatus;
    }

    /**
     * Set Log delivery status.
0: shipping disabled; 1: shipping enabled; 2: shipping activating; 3: shipping disabling
     * @param LogDeliveryStatus Log delivery status.
0: shipping disabled; 1: shipping enabled; 2: shipping activating; 3: shipping disabling
     */
    public void setLogDeliveryStatus(Long LogDeliveryStatus) {
        this.LogDeliveryStatus = LogDeliveryStatus;
    }

    /**
     * Get The causes for the log audit being forbidden to enable. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled 
     * @return LogDeliveryDisableReason The causes for the log audit being forbidden to enable. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled
     */
    public String getLogDeliveryDisableReason() {
        return this.LogDeliveryDisableReason;
    }

    /**
     * Set The causes for the log audit being forbidden to enable. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled
     * @param LogDeliveryDisableReason The causes for the log audit being forbidden to enable. Available values: VersionNotSupportLogSubscription, InstanceIsUpgrading, CdbRuleAuditEnabled
     */
    public void setLogDeliveryDisableReason(String LogDeliveryDisableReason) {
        this.LogDeliveryDisableReason = LogDeliveryDisableReason;
    }

    /**
     * Get Total number of logs for the current instance. 
     * @return TotalAuditLogs Total number of logs for the current instance.
     */
    public Long getTotalAuditLogs() {
        return this.TotalAuditLogs;
    }

    /**
     * Set Total number of logs for the current instance.
     * @param TotalAuditLogs Total number of logs for the current instance.
     */
    public void setTotalAuditLogs(Long TotalAuditLogs) {
        this.TotalAuditLogs = TotalAuditLogs;
    }

    /**
     * Get Number of recognized sensitive data items 
     * @return DataScanDetailRuleCount Number of recognized sensitive data items
     */
    public Long getDataScanDetailRuleCount() {
        return this.DataScanDetailRuleCount;
    }

    /**
     * Set Number of recognized sensitive data items
     * @param DataScanDetailRuleCount Number of recognized sensitive data items
     */
    public void setDataScanDetailRuleCount(Long DataScanDetailRuleCount) {
        this.DataScanDetailRuleCount = DataScanDetailRuleCount;
    }

    /**
     * Get Operation error information 
     * @return OperationErrorMsg Operation error information
     */
    public String getOperationErrorMsg() {
        return this.OperationErrorMsg;
    }

    /**
     * Set Operation error information
     * @param OperationErrorMsg Operation error information
     */
    public void setOperationErrorMsg(String OperationErrorMsg) {
        this.OperationErrorMsg = OperationErrorMsg;
    }

    public DspmAssetSecurityAnalyseStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetSecurityAnalyseStatus(DspmAssetSecurityAnalyseStatus source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IdentifyScanSupported != null) {
            this.IdentifyScanSupported = new Long(source.IdentifyScanSupported);
        }
        if (source.LogDeliverySupported != null) {
            this.LogDeliverySupported = new Long(source.LogDeliverySupported);
        }
        if (source.SecurityAnalyseStatus != null) {
            this.SecurityAnalyseStatus = new Long(source.SecurityAnalyseStatus);
        }
        if (source.LogDeliveryStatus != null) {
            this.LogDeliveryStatus = new Long(source.LogDeliveryStatus);
        }
        if (source.LogDeliveryDisableReason != null) {
            this.LogDeliveryDisableReason = new String(source.LogDeliveryDisableReason);
        }
        if (source.TotalAuditLogs != null) {
            this.TotalAuditLogs = new Long(source.TotalAuditLogs);
        }
        if (source.DataScanDetailRuleCount != null) {
            this.DataScanDetailRuleCount = new Long(source.DataScanDetailRuleCount);
        }
        if (source.OperationErrorMsg != null) {
            this.OperationErrorMsg = new String(source.OperationErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdentifyScanSupported", this.IdentifyScanSupported);
        this.setParamSimple(map, prefix + "LogDeliverySupported", this.LogDeliverySupported);
        this.setParamSimple(map, prefix + "SecurityAnalyseStatus", this.SecurityAnalyseStatus);
        this.setParamSimple(map, prefix + "LogDeliveryStatus", this.LogDeliveryStatus);
        this.setParamSimple(map, prefix + "LogDeliveryDisableReason", this.LogDeliveryDisableReason);
        this.setParamSimple(map, prefix + "TotalAuditLogs", this.TotalAuditLogs);
        this.setParamSimple(map, prefix + "DataScanDetailRuleCount", this.DataScanDetailRuleCount);
        this.setParamSimple(map, prefix + "OperationErrorMsg", this.OperationErrorMsg);

    }
}

