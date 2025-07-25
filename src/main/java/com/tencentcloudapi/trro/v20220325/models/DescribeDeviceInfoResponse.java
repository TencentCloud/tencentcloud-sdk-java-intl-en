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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceInfoResponse extends AbstractModel {

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Device type: "field" specifies on-site devices (controlled party), and "remote" specifies remote devices (controlling party).
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Device status: offline means offline, ready means online and ready, connected means in session.
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * Last updated time of device status.
    */
    @SerializedName("LastReportTime")
    @Expose
    private String LastReportTime;

    /**
    * Modification time of device information.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Device type: "field" specifies on-site devices (controlled party), and "remote" specifies remote devices (controlling party). 
     * @return DeviceType Device type: "field" specifies on-site devices (controlled party), and "remote" specifies remote devices (controlling party).
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type: "field" specifies on-site devices (controlled party), and "remote" specifies remote devices (controlling party).
     * @param DeviceType Device type: "field" specifies on-site devices (controlled party), and "remote" specifies remote devices (controlling party).
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Device status: offline means offline, ready means online and ready, connected means in session. 
     * @return DeviceStatus Device status: offline means offline, ready means online and ready, connected means in session.
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set Device status: offline means offline, ready means online and ready, connected means in session.
     * @param DeviceStatus Device status: offline means offline, ready means online and ready, connected means in session.
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get Last updated time of device status. 
     * @return LastReportTime Last updated time of device status.
     */
    public String getLastReportTime() {
        return this.LastReportTime;
    }

    /**
     * Set Last updated time of device status.
     * @param LastReportTime Last updated time of device status.
     */
    public void setLastReportTime(String LastReportTime) {
        this.LastReportTime = LastReportTime;
    }

    /**
     * Get Modification time of device information. 
     * @return ModifyTime Modification time of device information.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time of device information.
     * @param ModifyTime Modification time of device information.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceInfoResponse(DescribeDeviceInfoResponse source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.LastReportTime != null) {
            this.LastReportTime = new String(source.LastReportTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "LastReportTime", this.LastReportTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

