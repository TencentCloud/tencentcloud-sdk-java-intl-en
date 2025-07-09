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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintPolicy extends AbstractModel {

    /**
    * TCP port range, such as ["2000-3000","3500-4000"]
    */
    @SerializedName("TcpPortList")
    @Expose
    private String [] TcpPortList;

    /**
    * UDP port range, such as ["2000-3000","3500-4000"]
    */
    @SerializedName("UdpPortList")
    @Expose
    private String [] UdpPortList;

    /**
    * Watermark offset. Value range: [0, 100)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Whether to automatically remove. Valid values: [0 (no), 1 (yes)]
    */
    @SerializedName("RemoveSwitch")
    @Expose
    private Long RemoveSwitch;

    /**
    * Whether it is enabled. Valid values: [0 (no), 1 (yes)]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
     * Get TCP port range, such as ["2000-3000","3500-4000"] 
     * @return TcpPortList TCP port range, such as ["2000-3000","3500-4000"]
     */
    public String [] getTcpPortList() {
        return this.TcpPortList;
    }

    /**
     * Set TCP port range, such as ["2000-3000","3500-4000"]
     * @param TcpPortList TCP port range, such as ["2000-3000","3500-4000"]
     */
    public void setTcpPortList(String [] TcpPortList) {
        this.TcpPortList = TcpPortList;
    }

    /**
     * Get UDP port range, such as ["2000-3000","3500-4000"] 
     * @return UdpPortList UDP port range, such as ["2000-3000","3500-4000"]
     */
    public String [] getUdpPortList() {
        return this.UdpPortList;
    }

    /**
     * Set UDP port range, such as ["2000-3000","3500-4000"]
     * @param UdpPortList UDP port range, such as ["2000-3000","3500-4000"]
     */
    public void setUdpPortList(String [] UdpPortList) {
        this.UdpPortList = UdpPortList;
    }

    /**
     * Get Watermark offset. Value range: [0, 100) 
     * @return Offset Watermark offset. Value range: [0, 100)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Watermark offset. Value range: [0, 100)
     * @param Offset Watermark offset. Value range: [0, 100)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Whether to automatically remove. Valid values: [0 (no), 1 (yes)] 
     * @return RemoveSwitch Whether to automatically remove. Valid values: [0 (no), 1 (yes)]
     */
    public Long getRemoveSwitch() {
        return this.RemoveSwitch;
    }

    /**
     * Set Whether to automatically remove. Valid values: [0 (no), 1 (yes)]
     * @param RemoveSwitch Whether to automatically remove. Valid values: [0 (no), 1 (yes)]
     */
    public void setRemoveSwitch(Long RemoveSwitch) {
        this.RemoveSwitch = RemoveSwitch;
    }

    /**
     * Get Whether it is enabled. Valid values: [0 (no), 1 (yes)] 
     * @return OpenStatus Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     * @param OpenStatus Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    public WaterPrintPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterPrintPolicy(WaterPrintPolicy source) {
        if (source.TcpPortList != null) {
            this.TcpPortList = new String[source.TcpPortList.length];
            for (int i = 0; i < source.TcpPortList.length; i++) {
                this.TcpPortList[i] = new String(source.TcpPortList[i]);
            }
        }
        if (source.UdpPortList != null) {
            this.UdpPortList = new String[source.UdpPortList.length];
            for (int i = 0; i < source.UdpPortList.length; i++) {
                this.UdpPortList[i] = new String(source.UdpPortList[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RemoveSwitch != null) {
            this.RemoveSwitch = new Long(source.RemoveSwitch);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new Long(source.OpenStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TcpPortList.", this.TcpPortList);
        this.setParamArraySimple(map, prefix + "UdpPortList.", this.UdpPortList);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RemoveSwitch", this.RemoveSwitch);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);

    }
}

