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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineHostTopList extends AbstractModel {

    /**
    * List of event levels and occurrences
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventLevelList")
    @Expose
    private BaselineEventLevelInfo [] EventLevelList;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Score for calculating weight
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get List of event levels and occurrences
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventLevelList List of event levels and occurrences
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaselineEventLevelInfo [] getEventLevelList() {
        return this.EventLevelList;
    }

    /**
     * Set List of event levels and occurrences
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventLevelList List of event levels and occurrences
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventLevelList(BaselineEventLevelInfo [] EventLevelList) {
        this.EventLevelList = EventLevelList;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host QUUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Score for calculating weight
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score Score for calculating weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Score for calculating weight
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score Score for calculating weight
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public BaselineHostTopList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostTopList(BaselineHostTopList source) {
        if (source.EventLevelList != null) {
            this.EventLevelList = new BaselineEventLevelInfo[source.EventLevelList.length];
            for (int i = 0; i < source.EventLevelList.length; i++) {
                this.EventLevelList[i] = new BaselineEventLevelInfo(source.EventLevelList[i]);
            }
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventLevelList.", this.EventLevelList);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

