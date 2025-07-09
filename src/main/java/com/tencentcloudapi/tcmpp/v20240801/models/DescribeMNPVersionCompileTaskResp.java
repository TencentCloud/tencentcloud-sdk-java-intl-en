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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPVersionCompileTaskResp extends AbstractModel {

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task status message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskMsg")
    @Expose
    private String TaskMsg;

    /**
    * QR code address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QrCodeUrl")
    @Expose
    private String QrCodeUrl;

    /**
    * Packet size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PkgSize")
    @Expose
    private Long PkgSize;

    /**
    * Subpackage information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubPkgInfos")
    @Expose
    private DescribeMNPVersionCompileTaskSubSimpleInfo [] SubPkgInfos;

    /**
    * QR code content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QrCodeContent")
    @Expose
    private String QrCodeContent;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtInfo")
    @Expose
    private DescribeMNPVersionCompileTaskExtInfo ExtInfo;

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus 1: Pending; 20: Running; 30: Failed; 60: Succeeded 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task status message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskMsg Task status message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskMsg() {
        return this.TaskMsg;
    }

    /**
     * Set Task status message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskMsg Task status message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskMsg(String TaskMsg) {
        this.TaskMsg = TaskMsg;
    }

    /**
     * Get QR code address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QrCodeUrl QR code address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    /**
     * Set QR code address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QrCodeUrl QR code address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQrCodeUrl(String QrCodeUrl) {
        this.QrCodeUrl = QrCodeUrl;
    }

    /**
     * Get Packet size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PkgSize Packet size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPkgSize() {
        return this.PkgSize;
    }

    /**
     * Set Packet size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PkgSize Packet size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPkgSize(Long PkgSize) {
        this.PkgSize = PkgSize;
    }

    /**
     * Get Subpackage information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubPkgInfos Subpackage information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeMNPVersionCompileTaskSubSimpleInfo [] getSubPkgInfos() {
        return this.SubPkgInfos;
    }

    /**
     * Set Subpackage information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubPkgInfos Subpackage information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubPkgInfos(DescribeMNPVersionCompileTaskSubSimpleInfo [] SubPkgInfos) {
        this.SubPkgInfos = SubPkgInfos;
    }

    /**
     * Get QR code content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QrCodeContent QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQrCodeContent() {
        return this.QrCodeContent;
    }

    /**
     * Set QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QrCodeContent QR code content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQrCodeContent(String QrCodeContent) {
        this.QrCodeContent = QrCodeContent;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeMNPVersionCompileTaskExtInfo getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtInfo(DescribeMNPVersionCompileTaskExtInfo ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public DescribeMNPVersionCompileTaskResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPVersionCompileTaskResp(DescribeMNPVersionCompileTaskResp source) {
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
        if (source.QrCodeUrl != null) {
            this.QrCodeUrl = new String(source.QrCodeUrl);
        }
        if (source.PkgSize != null) {
            this.PkgSize = new Long(source.PkgSize);
        }
        if (source.SubPkgInfos != null) {
            this.SubPkgInfos = new DescribeMNPVersionCompileTaskSubSimpleInfo[source.SubPkgInfos.length];
            for (int i = 0; i < source.SubPkgInfos.length; i++) {
                this.SubPkgInfos[i] = new DescribeMNPVersionCompileTaskSubSimpleInfo(source.SubPkgInfos[i]);
            }
        }
        if (source.QrCodeContent != null) {
            this.QrCodeContent = new String(source.QrCodeContent);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new DescribeMNPVersionCompileTaskExtInfo(source.ExtInfo);
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
        this.setParamSimple(map, prefix + "QrCodeUrl", this.QrCodeUrl);
        this.setParamSimple(map, prefix + "PkgSize", this.PkgSize);
        this.setParamArrayObj(map, prefix + "SubPkgInfos.", this.SubPkgInfos);
        this.setParamSimple(map, prefix + "QrCodeContent", this.QrCodeContent);
        this.setParamObj(map, prefix + "ExtInfo.", this.ExtInfo);

    }
}

