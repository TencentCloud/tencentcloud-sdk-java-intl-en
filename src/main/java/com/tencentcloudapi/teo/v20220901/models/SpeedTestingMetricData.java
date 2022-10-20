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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingMetricData extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * The origin information.
    */
    @SerializedName("OriginSpeedTestingInfo")
    @Expose
    private SpeedTestingInfo [] OriginSpeedTestingInfo;

    /**
    * The EdgeOne information.
    */
    @SerializedName("ProxySpeedTestingInfo")
    @Expose
    private SpeedTestingInfo [] ProxySpeedTestingInfo;

    /**
    * The site status.
    */
    @SerializedName("SpeedTestingStatus")
    @Expose
    private SpeedTestingStatus SpeedTestingStatus;

    /**
    * The optimization suggestions.
    */
    @SerializedName("OptimizeAction")
    @Expose
    private OptimizeAction [] OptimizeAction;

    /**
    * The EdgeOne load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyLoadTime")
    @Expose
    private Long ProxyLoadTime;

    /**
    * The origin load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginLoadTime")
    @Expose
    private Long OriginLoadTime;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get The origin information. 
     * @return OriginSpeedTestingInfo The origin information.
     */
    public SpeedTestingInfo [] getOriginSpeedTestingInfo() {
        return this.OriginSpeedTestingInfo;
    }

    /**
     * Set The origin information.
     * @param OriginSpeedTestingInfo The origin information.
     */
    public void setOriginSpeedTestingInfo(SpeedTestingInfo [] OriginSpeedTestingInfo) {
        this.OriginSpeedTestingInfo = OriginSpeedTestingInfo;
    }

    /**
     * Get The EdgeOne information. 
     * @return ProxySpeedTestingInfo The EdgeOne information.
     */
    public SpeedTestingInfo [] getProxySpeedTestingInfo() {
        return this.ProxySpeedTestingInfo;
    }

    /**
     * Set The EdgeOne information.
     * @param ProxySpeedTestingInfo The EdgeOne information.
     */
    public void setProxySpeedTestingInfo(SpeedTestingInfo [] ProxySpeedTestingInfo) {
        this.ProxySpeedTestingInfo = ProxySpeedTestingInfo;
    }

    /**
     * Get The site status. 
     * @return SpeedTestingStatus The site status.
     */
    public SpeedTestingStatus getSpeedTestingStatus() {
        return this.SpeedTestingStatus;
    }

    /**
     * Set The site status.
     * @param SpeedTestingStatus The site status.
     */
    public void setSpeedTestingStatus(SpeedTestingStatus SpeedTestingStatus) {
        this.SpeedTestingStatus = SpeedTestingStatus;
    }

    /**
     * Get The optimization suggestions. 
     * @return OptimizeAction The optimization suggestions.
     */
    public OptimizeAction [] getOptimizeAction() {
        return this.OptimizeAction;
    }

    /**
     * Set The optimization suggestions.
     * @param OptimizeAction The optimization suggestions.
     */
    public void setOptimizeAction(OptimizeAction [] OptimizeAction) {
        this.OptimizeAction = OptimizeAction;
    }

    /**
     * Get The EdgeOne load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyLoadTime The EdgeOne load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProxyLoadTime() {
        return this.ProxyLoadTime;
    }

    /**
     * Set The EdgeOne load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyLoadTime The EdgeOne load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyLoadTime(Long ProxyLoadTime) {
        this.ProxyLoadTime = ProxyLoadTime;
    }

    /**
     * Get The origin load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginLoadTime The origin load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOriginLoadTime() {
        return this.OriginLoadTime;
    }

    /**
     * Set The origin load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginLoadTime The origin load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginLoadTime(Long OriginLoadTime) {
        this.OriginLoadTime = OriginLoadTime;
    }

    public SpeedTestingMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingMetricData(SpeedTestingMetricData source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.OriginSpeedTestingInfo != null) {
            this.OriginSpeedTestingInfo = new SpeedTestingInfo[source.OriginSpeedTestingInfo.length];
            for (int i = 0; i < source.OriginSpeedTestingInfo.length; i++) {
                this.OriginSpeedTestingInfo[i] = new SpeedTestingInfo(source.OriginSpeedTestingInfo[i]);
            }
        }
        if (source.ProxySpeedTestingInfo != null) {
            this.ProxySpeedTestingInfo = new SpeedTestingInfo[source.ProxySpeedTestingInfo.length];
            for (int i = 0; i < source.ProxySpeedTestingInfo.length; i++) {
                this.ProxySpeedTestingInfo[i] = new SpeedTestingInfo(source.ProxySpeedTestingInfo[i]);
            }
        }
        if (source.SpeedTestingStatus != null) {
            this.SpeedTestingStatus = new SpeedTestingStatus(source.SpeedTestingStatus);
        }
        if (source.OptimizeAction != null) {
            this.OptimizeAction = new OptimizeAction[source.OptimizeAction.length];
            for (int i = 0; i < source.OptimizeAction.length; i++) {
                this.OptimizeAction[i] = new OptimizeAction(source.OptimizeAction[i]);
            }
        }
        if (source.ProxyLoadTime != null) {
            this.ProxyLoadTime = new Long(source.ProxyLoadTime);
        }
        if (source.OriginLoadTime != null) {
            this.OriginLoadTime = new Long(source.OriginLoadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamArrayObj(map, prefix + "OriginSpeedTestingInfo.", this.OriginSpeedTestingInfo);
        this.setParamArrayObj(map, prefix + "ProxySpeedTestingInfo.", this.ProxySpeedTestingInfo);
        this.setParamObj(map, prefix + "SpeedTestingStatus.", this.SpeedTestingStatus);
        this.setParamArrayObj(map, prefix + "OptimizeAction.", this.OptimizeAction);
        this.setParamSimple(map, prefix + "ProxyLoadTime", this.ProxyLoadTime);
        this.setParamSimple(map, prefix + "OriginLoadTime", this.OriginLoadTime);

    }
}

