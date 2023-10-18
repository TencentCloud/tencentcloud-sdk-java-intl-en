/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataPerformancePageRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * `pagepv`: PV view; `allcount`: performance view; `falls`: page loading waterfall plot; `samp`: FMP, `day`: 14-day data, `nettype`: network/platform view; `performance`: top underperformed pages view; `version`/`platform`/`isp`/`region`/`device`/`browser`/`ext1`/`ext2`/`ext3`/`ret`/`status`/`from`/`url`/`env`: version view; device view; ISP view; region view; browser view, and so on.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Log level
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * ISP
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * Region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Network type
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Platform
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Model
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * Version
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * Custom 1
    */
    @SerializedName("ExtFirst")
    @Expose
    private String ExtFirst;

    /**
    * Custom 2
    */
    @SerializedName("ExtSecond")
    @Expose
    private String ExtSecond;

    /**
    * Custom 3
    */
    @SerializedName("ExtThird")
    @Expose
    private String ExtThird;

    /**
    * Whether it is outside the Chinese mainland
    */
    @SerializedName("IsAbroad")
    @Expose
    private String IsAbroad;

    /**
    * Browser
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * OS
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Browser engine
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Brand
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * Source page
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Duration calculation method
    */
    @SerializedName("CostType")
    @Expose
    private String CostType;

    /**
    * Environment variable
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * Network status
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
     * Get Project ID 
     * @return ID Project ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID
     * @param ID Project ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get `pagepv`: PV view; `allcount`: performance view; `falls`: page loading waterfall plot; `samp`: FMP, `day`: 14-day data, `nettype`: network/platform view; `performance`: top underperformed pages view; `version`/`platform`/`isp`/`region`/`device`/`browser`/`ext1`/`ext2`/`ext3`/`ret`/`status`/`from`/`url`/`env`: version view; device view; ISP view; region view; browser view, and so on. 
     * @return Type `pagepv`: PV view; `allcount`: performance view; `falls`: page loading waterfall plot; `samp`: FMP, `day`: 14-day data, `nettype`: network/platform view; `performance`: top underperformed pages view; `version`/`platform`/`isp`/`region`/`device`/`browser`/`ext1`/`ext2`/`ext3`/`ret`/`status`/`from`/`url`/`env`: version view; device view; ISP view; region view; browser view, and so on.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set `pagepv`: PV view; `allcount`: performance view; `falls`: page loading waterfall plot; `samp`: FMP, `day`: 14-day data, `nettype`: network/platform view; `performance`: top underperformed pages view; `version`/`platform`/`isp`/`region`/`device`/`browser`/`ext1`/`ext2`/`ext3`/`ret`/`status`/`from`/`url`/`env`: version view; device view; ISP view; region view; browser view, and so on.
     * @param Type `pagepv`: PV view; `allcount`: performance view; `falls`: page loading waterfall plot; `samp`: FMP, `day`: 14-day data, `nettype`: network/platform view; `performance`: top underperformed pages view; `version`/`platform`/`isp`/`region`/`device`/`browser`/`ext1`/`ext2`/`ext3`/`ret`/`status`/`from`/`url`/`env`: version view; device view; ISP view; region view; browser view, and so on.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Log level 
     * @return Level Log level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level
     * @param Level Log level
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get ISP 
     * @return Isp ISP
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set ISP
     * @param Isp ISP
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Region 
     * @return Area Region
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region
     * @param Area Region
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Network type 
     * @return NetType Network type
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type
     * @param NetType Network type
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Platform 
     * @return Platform Platform
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform
     * @param Platform Platform
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Model 
     * @return Device Model
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set Model
     * @param Device Model
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get Version 
     * @return VersionNum Version
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set Version
     * @param VersionNum Version
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get Custom 1 
     * @return ExtFirst Custom 1
     */
    public String getExtFirst() {
        return this.ExtFirst;
    }

    /**
     * Set Custom 1
     * @param ExtFirst Custom 1
     */
    public void setExtFirst(String ExtFirst) {
        this.ExtFirst = ExtFirst;
    }

    /**
     * Get Custom 2 
     * @return ExtSecond Custom 2
     */
    public String getExtSecond() {
        return this.ExtSecond;
    }

    /**
     * Set Custom 2
     * @param ExtSecond Custom 2
     */
    public void setExtSecond(String ExtSecond) {
        this.ExtSecond = ExtSecond;
    }

    /**
     * Get Custom 3 
     * @return ExtThird Custom 3
     */
    public String getExtThird() {
        return this.ExtThird;
    }

    /**
     * Set Custom 3
     * @param ExtThird Custom 3
     */
    public void setExtThird(String ExtThird) {
        this.ExtThird = ExtThird;
    }

    /**
     * Get Whether it is outside the Chinese mainland 
     * @return IsAbroad Whether it is outside the Chinese mainland
     */
    public String getIsAbroad() {
        return this.IsAbroad;
    }

    /**
     * Set Whether it is outside the Chinese mainland
     * @param IsAbroad Whether it is outside the Chinese mainland
     */
    public void setIsAbroad(String IsAbroad) {
        this.IsAbroad = IsAbroad;
    }

    /**
     * Get Browser 
     * @return Browser Browser
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set Browser
     * @param Browser Browser
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get OS 
     * @return Os OS
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set OS
     * @param Os OS
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Browser engine 
     * @return Engine Browser engine
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Browser engine
     * @param Engine Browser engine
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Brand 
     * @return Brand Brand
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set Brand
     * @param Brand Brand
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get Source page 
     * @return From Source page
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source page
     * @param From Source page
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Duration calculation method 
     * @return CostType Duration calculation method
     */
    public String getCostType() {
        return this.CostType;
    }

    /**
     * Set Duration calculation method
     * @param CostType Duration calculation method
     */
    public void setCostType(String CostType) {
        this.CostType = CostType;
    }

    /**
     * Get Environment variable 
     * @return Env Environment variable
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set Environment variable
     * @param Env Environment variable
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get Network status 
     * @return NetStatus Network status
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set Network status
     * @param NetStatus Network status
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    public DescribeDataPerformancePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataPerformancePageRequest(DescribeDataPerformancePageRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.ExtFirst != null) {
            this.ExtFirst = new String(source.ExtFirst);
        }
        if (source.ExtSecond != null) {
            this.ExtSecond = new String(source.ExtSecond);
        }
        if (source.ExtThird != null) {
            this.ExtThird = new String(source.ExtThird);
        }
        if (source.IsAbroad != null) {
            this.IsAbroad = new String(source.IsAbroad);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CostType != null) {
            this.CostType = new String(source.CostType);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "ExtFirst", this.ExtFirst);
        this.setParamSimple(map, prefix + "ExtSecond", this.ExtSecond);
        this.setParamSimple(map, prefix + "ExtThird", this.ExtThird);
        this.setParamSimple(map, prefix + "IsAbroad", this.IsAbroad);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);

    }
}

