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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGVersionResp extends AbstractModel {

    /**
    * <p>Mini game appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task status. Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded.</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>Task status information.</p>
    */
    @SerializedName("TaskMsg")
    @Expose
    private String TaskMsg;

    /**
    * <p>Mini game version ID (returned upon successful compilation).</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>QR code expiration time.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>Version QR code.</p>
    */
    @SerializedName("QRCode")
    @Expose
    private String QRCode;

    /**
    * <p>Compilation package information.</p>
    */
    @SerializedName("SubPackageInfos")
    @Expose
    private MNPVersionSubPackageInfo [] SubPackageInfos;

    /**
     * Get <p>Mini game appid.</p> 
     * @return MNPId <p>Mini game appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid.</p>
     * @param MNPId <p>Mini game appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task status. Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded.</p> 
     * @return TaskStatus <p>Task status. Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded.</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status. Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded.</p>
     * @param TaskStatus <p>Task status. Valid values: 1: Pending; 20: Running; 30: Failed; 60: Succeeded.</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Task status information.</p> 
     * @return TaskMsg <p>Task status information.</p>
     */
    public String getTaskMsg() {
        return this.TaskMsg;
    }

    /**
     * Set <p>Task status information.</p>
     * @param TaskMsg <p>Task status information.</p>
     */
    public void setTaskMsg(String TaskMsg) {
        this.TaskMsg = TaskMsg;
    }

    /**
     * Get <p>Mini game version ID (returned upon successful compilation).</p> 
     * @return MNPVersionId <p>Mini game version ID (returned upon successful compilation).</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini game version ID (returned upon successful compilation).</p>
     * @param MNPVersionId <p>Mini game version ID (returned upon successful compilation).</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get <p>QR code expiration time.</p> 
     * @return ExpireTime <p>QR code expiration time.</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>QR code expiration time.</p>
     * @param ExpireTime <p>QR code expiration time.</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Version QR code.</p> 
     * @return QRCode <p>Version QR code.</p>
     */
    public String getQRCode() {
        return this.QRCode;
    }

    /**
     * Set <p>Version QR code.</p>
     * @param QRCode <p>Version QR code.</p>
     */
    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }

    /**
     * Get <p>Compilation package information.</p> 
     * @return SubPackageInfos <p>Compilation package information.</p>
     */
    public MNPVersionSubPackageInfo [] getSubPackageInfos() {
        return this.SubPackageInfos;
    }

    /**
     * Set <p>Compilation package information.</p>
     * @param SubPackageInfos <p>Compilation package information.</p>
     */
    public void setSubPackageInfos(MNPVersionSubPackageInfo [] SubPackageInfos) {
        this.SubPackageInfos = SubPackageInfos;
    }

    public DescribeMNGVersionResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGVersionResp(DescribeMNGVersionResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskMsg != null) {
            this.TaskMsg = new String(source.TaskMsg);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.QRCode != null) {
            this.QRCode = new String(source.QRCode);
        }
        if (source.SubPackageInfos != null) {
            this.SubPackageInfos = new MNPVersionSubPackageInfo[source.SubPackageInfos.length];
            for (int i = 0; i < source.SubPackageInfos.length; i++) {
                this.SubPackageInfos[i] = new MNPVersionSubPackageInfo(source.SubPackageInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskMsg", this.TaskMsg);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "QRCode", this.QRCode);
        this.setParamArrayObj(map, prefix + "SubPackageInfos.", this.SubPackageInfos);

    }
}

