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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataLogUrlStatisticsV2Request extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * analysis: exception analysis. compare: exception list comparison. allcount: performance view. condition: condition list. nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/: network platform view, version view, device view, ISP view, region view, browser view, ext1 view, and so on.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Project ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Custom parameter 2.
    */
    @SerializedName("ExtSecond")
    @Expose
    private String ExtSecond;

    /**
    * Browser engine.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Internet service provider.
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * Source page.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Log level.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Brand.
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * Region.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Version.
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * Platform.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Custom parameter 3.
    */
    @SerializedName("ExtThird")
    @Expose
    private String ExtThird;

    /**
    * Custom parameter 1.
    */
    @SerializedName("ExtFirst")
    @Expose
    private String ExtFirst;

    /**
    * Network type.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Model.
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * Indicates whether to query global data. 1 indicates global. 0 indicates not global. This is empty by default, which means to query all data.
    */
    @SerializedName("IsAbroad")
    @Expose
    private String IsAbroad;

    /**
    * Operating system.
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Browser.
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * Environment differentiation.
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * JavaScript exception message.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Custom parameter 4.
    */
    @SerializedName("ExtFourth")
    @Expose
    private String ExtFourth;

    /**
    * Custom parameter 5.
    */
    @SerializedName("ExtFifth")
    @Expose
    private String ExtFifth;

    /**
    * Custom parameter 6.
    */
    @SerializedName("ExtSixth")
    @Expose
    private String ExtSixth;

    /**
    * Custom parameter 7.
    */
    @SerializedName("ExtSeventh")
    @Expose
    private String ExtSeventh;

    /**
    * Custom parameter 8.
    */
    @SerializedName("ExtEighth")
    @Expose
    private String ExtEighth;

    /**
    * Custom parameter 9.
    */
    @SerializedName("ExtNinth")
    @Expose
    private String ExtNinth;

    /**
    * Custom parameter 10.
    */
    @SerializedName("ExtTenth")
    @Expose
    private String ExtTenth;

    /**
    * Time period.
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get analysis: exception analysis. compare: exception list comparison. allcount: performance view. condition: condition list. nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/: network platform view, version view, device view, ISP view, region view, browser view, ext1 view, and so on. 
     * @return Type analysis: exception analysis. compare: exception list comparison. allcount: performance view. condition: condition list. nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/: network platform view, version view, device view, ISP view, region view, browser view, ext1 view, and so on.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set analysis: exception analysis. compare: exception list comparison. allcount: performance view. condition: condition list. nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/: network platform view, version view, device view, ISP view, region view, browser view, ext1 view, and so on.
     * @param Type analysis: exception analysis. compare: exception list comparison. allcount: performance view. condition: condition list. nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/: network platform view, version view, device view, ISP view, region view, browser view, ext1 view, and so on.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Project ID. 
     * @return ID Project ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID.
     * @param ID Project ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Custom parameter 2. 
     * @return ExtSecond Custom parameter 2.
     */
    public String getExtSecond() {
        return this.ExtSecond;
    }

    /**
     * Set Custom parameter 2.
     * @param ExtSecond Custom parameter 2.
     */
    public void setExtSecond(String ExtSecond) {
        this.ExtSecond = ExtSecond;
    }

    /**
     * Get Browser engine. 
     * @return Engine Browser engine.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Browser engine.
     * @param Engine Browser engine.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Internet service provider. 
     * @return Isp Internet service provider.
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set Internet service provider.
     * @param Isp Internet service provider.
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Source page. 
     * @return From Source page.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source page.
     * @param From Source page.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Log level. 
     * @return Level Log level.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Log level.
     * @param Level Log level.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Brand. 
     * @return Brand Brand.
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set Brand.
     * @param Brand Brand.
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get Region. 
     * @return Area Region.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region.
     * @param Area Region.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Version. 
     * @return VersionNum Version.
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set Version.
     * @param VersionNum Version.
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get Platform. 
     * @return Platform Platform.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Platform.
     * @param Platform Platform.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Custom parameter 3. 
     * @return ExtThird Custom parameter 3.
     */
    public String getExtThird() {
        return this.ExtThird;
    }

    /**
     * Set Custom parameter 3.
     * @param ExtThird Custom parameter 3.
     */
    public void setExtThird(String ExtThird) {
        this.ExtThird = ExtThird;
    }

    /**
     * Get Custom parameter 1. 
     * @return ExtFirst Custom parameter 1.
     */
    public String getExtFirst() {
        return this.ExtFirst;
    }

    /**
     * Set Custom parameter 1.
     * @param ExtFirst Custom parameter 1.
     */
    public void setExtFirst(String ExtFirst) {
        this.ExtFirst = ExtFirst;
    }

    /**
     * Get Network type. 
     * @return NetType Network type.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type.
     * @param NetType Network type.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Model. 
     * @return Device Model.
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set Model.
     * @param Device Model.
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get Indicates whether to query global data. 1 indicates global. 0 indicates not global. This is empty by default, which means to query all data. 
     * @return IsAbroad Indicates whether to query global data. 1 indicates global. 0 indicates not global. This is empty by default, which means to query all data.
     */
    public String getIsAbroad() {
        return this.IsAbroad;
    }

    /**
     * Set Indicates whether to query global data. 1 indicates global. 0 indicates not global. This is empty by default, which means to query all data.
     * @param IsAbroad Indicates whether to query global data. 1 indicates global. 0 indicates not global. This is empty by default, which means to query all data.
     */
    public void setIsAbroad(String IsAbroad) {
        this.IsAbroad = IsAbroad;
    }

    /**
     * Get Operating system. 
     * @return Os Operating system.
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Operating system.
     * @param Os Operating system.
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Browser. 
     * @return Browser Browser.
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set Browser.
     * @param Browser Browser.
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get Environment differentiation. 
     * @return Env Environment differentiation.
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set Environment differentiation.
     * @param Env Environment differentiation.
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get JavaScript exception message. 
     * @return ErrorMsg JavaScript exception message.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set JavaScript exception message.
     * @param ErrorMsg JavaScript exception message.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Custom parameter 4. 
     * @return ExtFourth Custom parameter 4.
     */
    public String getExtFourth() {
        return this.ExtFourth;
    }

    /**
     * Set Custom parameter 4.
     * @param ExtFourth Custom parameter 4.
     */
    public void setExtFourth(String ExtFourth) {
        this.ExtFourth = ExtFourth;
    }

    /**
     * Get Custom parameter 5. 
     * @return ExtFifth Custom parameter 5.
     */
    public String getExtFifth() {
        return this.ExtFifth;
    }

    /**
     * Set Custom parameter 5.
     * @param ExtFifth Custom parameter 5.
     */
    public void setExtFifth(String ExtFifth) {
        this.ExtFifth = ExtFifth;
    }

    /**
     * Get Custom parameter 6. 
     * @return ExtSixth Custom parameter 6.
     */
    public String getExtSixth() {
        return this.ExtSixth;
    }

    /**
     * Set Custom parameter 6.
     * @param ExtSixth Custom parameter 6.
     */
    public void setExtSixth(String ExtSixth) {
        this.ExtSixth = ExtSixth;
    }

    /**
     * Get Custom parameter 7. 
     * @return ExtSeventh Custom parameter 7.
     */
    public String getExtSeventh() {
        return this.ExtSeventh;
    }

    /**
     * Set Custom parameter 7.
     * @param ExtSeventh Custom parameter 7.
     */
    public void setExtSeventh(String ExtSeventh) {
        this.ExtSeventh = ExtSeventh;
    }

    /**
     * Get Custom parameter 8. 
     * @return ExtEighth Custom parameter 8.
     */
    public String getExtEighth() {
        return this.ExtEighth;
    }

    /**
     * Set Custom parameter 8.
     * @param ExtEighth Custom parameter 8.
     */
    public void setExtEighth(String ExtEighth) {
        this.ExtEighth = ExtEighth;
    }

    /**
     * Get Custom parameter 9. 
     * @return ExtNinth Custom parameter 9.
     */
    public String getExtNinth() {
        return this.ExtNinth;
    }

    /**
     * Set Custom parameter 9.
     * @param ExtNinth Custom parameter 9.
     */
    public void setExtNinth(String ExtNinth) {
        this.ExtNinth = ExtNinth;
    }

    /**
     * Get Custom parameter 10. 
     * @return ExtTenth Custom parameter 10.
     */
    public String getExtTenth() {
        return this.ExtTenth;
    }

    /**
     * Set Custom parameter 10.
     * @param ExtTenth Custom parameter 10.
     */
    public void setExtTenth(String ExtTenth) {
        this.ExtTenth = ExtTenth;
    }

    /**
     * Get Time period. 
     * @return Granularity Time period.
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Time period.
     * @param Granularity Time period.
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    public DescribeDataLogUrlStatisticsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataLogUrlStatisticsV2Request(DescribeDataLogUrlStatisticsV2Request source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ExtSecond != null) {
            this.ExtSecond = new String(source.ExtSecond);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ExtThird != null) {
            this.ExtThird = new String(source.ExtThird);
        }
        if (source.ExtFirst != null) {
            this.ExtFirst = new String(source.ExtFirst);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.IsAbroad != null) {
            this.IsAbroad = new String(source.IsAbroad);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ExtFourth != null) {
            this.ExtFourth = new String(source.ExtFourth);
        }
        if (source.ExtFifth != null) {
            this.ExtFifth = new String(source.ExtFifth);
        }
        if (source.ExtSixth != null) {
            this.ExtSixth = new String(source.ExtSixth);
        }
        if (source.ExtSeventh != null) {
            this.ExtSeventh = new String(source.ExtSeventh);
        }
        if (source.ExtEighth != null) {
            this.ExtEighth = new String(source.ExtEighth);
        }
        if (source.ExtNinth != null) {
            this.ExtNinth = new String(source.ExtNinth);
        }
        if (source.ExtTenth != null) {
            this.ExtTenth = new String(source.ExtTenth);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ExtSecond", this.ExtSecond);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ExtThird", this.ExtThird);
        this.setParamSimple(map, prefix + "ExtFirst", this.ExtFirst);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "IsAbroad", this.IsAbroad);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ExtFourth", this.ExtFourth);
        this.setParamSimple(map, prefix + "ExtFifth", this.ExtFifth);
        this.setParamSimple(map, prefix + "ExtSixth", this.ExtSixth);
        this.setParamSimple(map, prefix + "ExtSeventh", this.ExtSeventh);
        this.setParamSimple(map, prefix + "ExtEighth", this.ExtEighth);
        this.setParamSimple(map, prefix + "ExtNinth", this.ExtNinth);
        this.setParamSimple(map, prefix + "ExtTenth", this.ExtTenth);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

