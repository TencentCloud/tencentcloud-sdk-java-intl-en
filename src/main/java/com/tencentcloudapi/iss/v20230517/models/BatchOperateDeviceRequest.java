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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchOperateDeviceRequest extends AbstractModel {

    /**
    * <p>Device ID array (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * <p>Operation command</p><p>Enumeration values:</p><ul><li>enable: Enable</li><li>disable: Disable</li><li>delete: Delete</li><li>sync: Synchronize device channel</li></ul>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
     * Get <p>Device ID array (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p> 
     * @return DeviceIds <p>Device ID array (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set <p>Device ID array (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     * @param DeviceIds <p>Device ID array (obtain from the device list API ListDevices)</p><p>For parameter values, see <a href="https://www.tencentcloud.com/document/api/1344/95871?from_cn_redirect=1">ListDevices</a></p>
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get <p>Operation command</p><p>Enumeration values:</p><ul><li>enable: Enable</li><li>disable: Disable</li><li>delete: Delete</li><li>sync: Synchronize device channel</li></ul> 
     * @return Cmd <p>Operation command</p><p>Enumeration values:</p><ul><li>enable: Enable</li><li>disable: Disable</li><li>delete: Delete</li><li>sync: Synchronize device channel</li></ul>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Operation command</p><p>Enumeration values:</p><ul><li>enable: Enable</li><li>disable: Disable</li><li>delete: Delete</li><li>sync: Synchronize device channel</li></ul>
     * @param Cmd <p>Operation command</p><p>Enumeration values:</p><ul><li>enable: Enable</li><li>disable: Disable</li><li>delete: Delete</li><li>sync: Synchronize device channel</li></ul>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    public BatchOperateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchOperateDeviceRequest(BatchOperateDeviceRequest source) {
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

