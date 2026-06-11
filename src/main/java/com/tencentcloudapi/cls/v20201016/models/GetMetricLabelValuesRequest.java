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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMetricLabelValuesRequest extends AbstractModel {

    /**
    * <p>Time Series Topic id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Name of time series label</p>
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>Start time</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>End time.</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * <p>Label match rule</p>
    */
    @SerializedName("Match")
    @Expose
    private String [] Match;

    /**
     * Get <p>Time Series Topic id</p> 
     * @return TopicId <p>Time Series Topic id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Time Series Topic id</p>
     * @param TopicId <p>Time Series Topic id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Name of time series label</p> 
     * @return LabelName <p>Name of time series label</p>
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set <p>Name of time series label</p>
     * @param LabelName <p>Name of time series label</p>
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>Start time</p> 
     * @return Start <p>Start time</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>Start time</p>
     * @param Start <p>Start time</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>End time.</p> 
     * @return End <p>End time.</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>End time.</p>
     * @param End <p>End time.</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get <p>Label match rule</p> 
     * @return Match <p>Label match rule</p>
     */
    public String [] getMatch() {
        return this.Match;
    }

    /**
     * Set <p>Label match rule</p>
     * @param Match <p>Label match rule</p>
     */
    public void setMatch(String [] Match) {
        this.Match = Match;
    }

    public GetMetricLabelValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMetricLabelValuesRequest(GetMetricLabelValuesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Match != null) {
            this.Match = new String[source.Match.length];
            for (int i = 0; i < source.Match.length; i++) {
                this.Match[i] = new String(source.Match[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamArraySimple(map, prefix + "Match.", this.Match);

    }
}

