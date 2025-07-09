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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TablePropertyScore extends AbstractModel {

    /**
    * Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Statistics Date
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * Table Integrity Score
    */
    @SerializedName("Integrity")
    @Expose
    private Float Integrity;

    /**
    * Table Assurance Score
    */
    @SerializedName("Safety")
    @Expose
    private Float Safety;

    /**
    * Table Timeliness Score
    */
    @SerializedName("Timeliness")
    @Expose
    private Float Timeliness;

    /**
    * Table Stability Score
    */
    @SerializedName("Stability")
    @Expose
    private Float Stability;

    /**
    * Table Normalization Score
    */
    @SerializedName("Normative")
    @Expose
    private Float Normative;

    /**
    * Average Asset Score
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
     * Get Table ID 
     * @return TableId Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
     * @param TableId Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Statistics Date 
     * @return DayTime Statistics Date
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * Set Statistics Date
     * @param DayTime Statistics Date
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * Get Table Integrity Score 
     * @return Integrity Table Integrity Score
     */
    public Float getIntegrity() {
        return this.Integrity;
    }

    /**
     * Set Table Integrity Score
     * @param Integrity Table Integrity Score
     */
    public void setIntegrity(Float Integrity) {
        this.Integrity = Integrity;
    }

    /**
     * Get Table Assurance Score 
     * @return Safety Table Assurance Score
     */
    public Float getSafety() {
        return this.Safety;
    }

    /**
     * Set Table Assurance Score
     * @param Safety Table Assurance Score
     */
    public void setSafety(Float Safety) {
        this.Safety = Safety;
    }

    /**
     * Get Table Timeliness Score 
     * @return Timeliness Table Timeliness Score
     */
    public Float getTimeliness() {
        return this.Timeliness;
    }

    /**
     * Set Table Timeliness Score
     * @param Timeliness Table Timeliness Score
     */
    public void setTimeliness(Float Timeliness) {
        this.Timeliness = Timeliness;
    }

    /**
     * Get Table Stability Score 
     * @return Stability Table Stability Score
     */
    public Float getStability() {
        return this.Stability;
    }

    /**
     * Set Table Stability Score
     * @param Stability Table Stability Score
     */
    public void setStability(Float Stability) {
        this.Stability = Stability;
    }

    /**
     * Get Table Normalization Score 
     * @return Normative Table Normalization Score
     */
    public Float getNormative() {
        return this.Normative;
    }

    /**
     * Set Table Normalization Score
     * @param Normative Table Normalization Score
     */
    public void setNormative(Float Normative) {
        this.Normative = Normative;
    }

    /**
     * Get Average Asset Score 
     * @return Average Average Asset Score
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set Average Asset Score
     * @param Average Average Asset Score
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    public TablePropertyScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablePropertyScore(TablePropertyScore source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DayTime != null) {
            this.DayTime = new String(source.DayTime);
        }
        if (source.Integrity != null) {
            this.Integrity = new Float(source.Integrity);
        }
        if (source.Safety != null) {
            this.Safety = new Float(source.Safety);
        }
        if (source.Timeliness != null) {
            this.Timeliness = new Float(source.Timeliness);
        }
        if (source.Stability != null) {
            this.Stability = new Float(source.Stability);
        }
        if (source.Normative != null) {
            this.Normative = new Float(source.Normative);
        }
        if (source.Average != null) {
            this.Average = new Float(source.Average);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "Integrity", this.Integrity);
        this.setParamSimple(map, prefix + "Safety", this.Safety);
        this.setParamSimple(map, prefix + "Timeliness", this.Timeliness);
        this.setParamSimple(map, prefix + "Stability", this.Stability);
        this.setParamSimple(map, prefix + "Normative", this.Normative);
        this.setParamSimple(map, prefix + "Average", this.Average);

    }
}

