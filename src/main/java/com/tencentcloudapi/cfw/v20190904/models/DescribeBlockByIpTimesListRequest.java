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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlockByIpTimesListRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * IP search criteria
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Direction
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Inter-VPC firewall toggle edge ID
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Log source. move: inter-VPC firewall
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get IP search criteria 
     * @return Ip IP search criteria
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP search criteria
     * @param Ip IP search criteria
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Region 
     * @return Zone Region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
     * @param Zone Region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Direction 
     * @return Direction Direction
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction
     * @param Direction Direction
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Source 
     * @return Source Source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source
     * @param Source Source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Inter-VPC firewall toggle edge ID 
     * @return EdgeId Inter-VPC firewall toggle edge ID
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Inter-VPC firewall toggle edge ID
     * @param EdgeId Inter-VPC firewall toggle edge ID
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Log source. move: inter-VPC firewall 
     * @return LogSource Log source. move: inter-VPC firewall
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set Log source. move: inter-VPC firewall
     * @param LogSource Log source. move: inter-VPC firewall
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    public DescribeBlockByIpTimesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockByIpTimesListRequest(DescribeBlockByIpTimesListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);

    }
}

