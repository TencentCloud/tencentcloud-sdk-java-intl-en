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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceNetInfo extends AbstractModel {

    /**
    * Network type:
Data
1:Wi-Fi
2: Wired
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Enable or disable.
    */
    @SerializedName("DataEnable")
    @Expose
    private Boolean DataEnable;

    /**
    * Uplink speed limit
    */
    @SerializedName("UploadLimit")
    @Expose
    private String UploadLimit;

    /**
    * Downstream speed limit
    */
    @SerializedName("DownloadLimit")
    @Expose
    private String DownloadLimit;

    /**
    * receive real-time speed
    */
    @SerializedName("DataRx")
    @Expose
    private Long DataRx;

    /**
    * Send real-time speed
    */
    @SerializedName("DataTx")
    @Expose
    private Long DataTx;

    /**
    * Operator type:
1: CMCC;
2: CTCC 
3: CUCC
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * Connection status:
0: connectionless
1: Connecting
2: Connected
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Signal strength/Measurement unit: dbm
    */
    @SerializedName("SignalStrength")
    @Expose
    private Long SignalStrength;

    /**
    * Data network type:
-1: Invalid value.   
2:2G 
3:3G 
4:4G 
5:5G
    */
    @SerializedName("Rat")
    @Expose
    private Long Rat;

    /**
    * NIC Name
    */
    @SerializedName("NetInfoName")
    @Expose
    private String NetInfoName;

    /**
    * Downstream real-time rate (floating-point type replaces the integer type of the previous version DataRx).
    */
    @SerializedName("DownRate")
    @Expose
    private Float DownRate;

    /**
    * Uplink real-time rate (floating-point type replaces the integer of the previous version TxRate)
    */
    @SerializedName("UpRate")
    @Expose
    private Float UpRate;

    /**
     * Get Network type:
Data
1:Wi-Fi
2: Wired 
     * @return Type Network type:
Data
1:Wi-Fi
2: Wired
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Network type:
Data
1:Wi-Fi
2: Wired
     * @param Type Network type:
Data
1:Wi-Fi
2: Wired
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Enable or disable. 
     * @return DataEnable Enable or disable.
     */
    public Boolean getDataEnable() {
        return this.DataEnable;
    }

    /**
     * Set Enable or disable.
     * @param DataEnable Enable or disable.
     */
    public void setDataEnable(Boolean DataEnable) {
        this.DataEnable = DataEnable;
    }

    /**
     * Get Uplink speed limit 
     * @return UploadLimit Uplink speed limit
     */
    public String getUploadLimit() {
        return this.UploadLimit;
    }

    /**
     * Set Uplink speed limit
     * @param UploadLimit Uplink speed limit
     */
    public void setUploadLimit(String UploadLimit) {
        this.UploadLimit = UploadLimit;
    }

    /**
     * Get Downstream speed limit 
     * @return DownloadLimit Downstream speed limit
     */
    public String getDownloadLimit() {
        return this.DownloadLimit;
    }

    /**
     * Set Downstream speed limit
     * @param DownloadLimit Downstream speed limit
     */
    public void setDownloadLimit(String DownloadLimit) {
        this.DownloadLimit = DownloadLimit;
    }

    /**
     * Get receive real-time speed 
     * @return DataRx receive real-time speed
     */
    public Long getDataRx() {
        return this.DataRx;
    }

    /**
     * Set receive real-time speed
     * @param DataRx receive real-time speed
     */
    public void setDataRx(Long DataRx) {
        this.DataRx = DataRx;
    }

    /**
     * Get Send real-time speed 
     * @return DataTx Send real-time speed
     */
    public Long getDataTx() {
        return this.DataTx;
    }

    /**
     * Set Send real-time speed
     * @param DataTx Send real-time speed
     */
    public void setDataTx(Long DataTx) {
        this.DataTx = DataTx;
    }

    /**
     * Get Operator type:
1: CMCC;
2: CTCC 
3: CUCC 
     * @return Vendor Operator type:
1: CMCC;
2: CTCC 
3: CUCC
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set Operator type:
1: CMCC;
2: CTCC 
3: CUCC
     * @param Vendor Operator type:
1: CMCC;
2: CTCC 
3: CUCC
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get Connection status:
0: connectionless
1: Connecting
2: Connected 
     * @return State Connection status:
0: connectionless
1: Connecting
2: Connected
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Connection status:
0: connectionless
1: Connecting
2: Connected
     * @param State Connection status:
0: connectionless
1: Connecting
2: Connected
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Signal strength/Measurement unit: dbm 
     * @return SignalStrength Signal strength/Measurement unit: dbm
     */
    public Long getSignalStrength() {
        return this.SignalStrength;
    }

    /**
     * Set Signal strength/Measurement unit: dbm
     * @param SignalStrength Signal strength/Measurement unit: dbm
     */
    public void setSignalStrength(Long SignalStrength) {
        this.SignalStrength = SignalStrength;
    }

    /**
     * Get Data network type:
-1: Invalid value.   
2:2G 
3:3G 
4:4G 
5:5G 
     * @return Rat Data network type:
-1: Invalid value.   
2:2G 
3:3G 
4:4G 
5:5G
     */
    public Long getRat() {
        return this.Rat;
    }

    /**
     * Set Data network type:
-1: Invalid value.   
2:2G 
3:3G 
4:4G 
5:5G
     * @param Rat Data network type:
-1: Invalid value.   
2:2G 
3:3G 
4:4G 
5:5G
     */
    public void setRat(Long Rat) {
        this.Rat = Rat;
    }

    /**
     * Get NIC Name 
     * @return NetInfoName NIC Name
     */
    public String getNetInfoName() {
        return this.NetInfoName;
    }

    /**
     * Set NIC Name
     * @param NetInfoName NIC Name
     */
    public void setNetInfoName(String NetInfoName) {
        this.NetInfoName = NetInfoName;
    }

    /**
     * Get Downstream real-time rate (floating-point type replaces the integer type of the previous version DataRx). 
     * @return DownRate Downstream real-time rate (floating-point type replaces the integer type of the previous version DataRx).
     */
    public Float getDownRate() {
        return this.DownRate;
    }

    /**
     * Set Downstream real-time rate (floating-point type replaces the integer type of the previous version DataRx).
     * @param DownRate Downstream real-time rate (floating-point type replaces the integer type of the previous version DataRx).
     */
    public void setDownRate(Float DownRate) {
        this.DownRate = DownRate;
    }

    /**
     * Get Uplink real-time rate (floating-point type replaces the integer of the previous version TxRate) 
     * @return UpRate Uplink real-time rate (floating-point type replaces the integer of the previous version TxRate)
     */
    public Float getUpRate() {
        return this.UpRate;
    }

    /**
     * Set Uplink real-time rate (floating-point type replaces the integer of the previous version TxRate)
     * @param UpRate Uplink real-time rate (floating-point type replaces the integer of the previous version TxRate)
     */
    public void setUpRate(Float UpRate) {
        this.UpRate = UpRate;
    }

    public DeviceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceNetInfo(DeviceNetInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DataEnable != null) {
            this.DataEnable = new Boolean(source.DataEnable);
        }
        if (source.UploadLimit != null) {
            this.UploadLimit = new String(source.UploadLimit);
        }
        if (source.DownloadLimit != null) {
            this.DownloadLimit = new String(source.DownloadLimit);
        }
        if (source.DataRx != null) {
            this.DataRx = new Long(source.DataRx);
        }
        if (source.DataTx != null) {
            this.DataTx = new Long(source.DataTx);
        }
        if (source.Vendor != null) {
            this.Vendor = new Long(source.Vendor);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.SignalStrength != null) {
            this.SignalStrength = new Long(source.SignalStrength);
        }
        if (source.Rat != null) {
            this.Rat = new Long(source.Rat);
        }
        if (source.NetInfoName != null) {
            this.NetInfoName = new String(source.NetInfoName);
        }
        if (source.DownRate != null) {
            this.DownRate = new Float(source.DownRate);
        }
        if (source.UpRate != null) {
            this.UpRate = new Float(source.UpRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataEnable", this.DataEnable);
        this.setParamSimple(map, prefix + "UploadLimit", this.UploadLimit);
        this.setParamSimple(map, prefix + "DownloadLimit", this.DownloadLimit);
        this.setParamSimple(map, prefix + "DataRx", this.DataRx);
        this.setParamSimple(map, prefix + "DataTx", this.DataTx);
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "SignalStrength", this.SignalStrength);
        this.setParamSimple(map, prefix + "Rat", this.Rat);
        this.setParamSimple(map, prefix + "NetInfoName", this.NetInfoName);
        this.setParamSimple(map, prefix + "DownRate", this.DownRate);
        this.setParamSimple(map, prefix + "UpRate", this.UpRate);

    }
}

