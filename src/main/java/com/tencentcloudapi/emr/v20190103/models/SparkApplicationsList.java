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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkApplicationsList extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Application name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * User.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Duration.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Status.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Type.
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Number of cores multiplied by seconds.
    */
    @SerializedName("CoreSeconds")
    @Expose
    private Long CoreSeconds;

    /**
    * Memory MB multiplied by seconds.
    */
    @SerializedName("MemorySeconds")
    @Expose
    private String MemorySeconds;

    /**
    * Insight result.
    */
    @SerializedName("Insight")
    @Expose
    private String Insight;

    /**
     * Get Application ID. 
     * @return ID Application ID.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Application ID.
     * @param ID Application ID.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Application name. 
     * @return Name Application name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Application name.
     * @param Name Application name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get User. 
     * @return User User.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User.
     * @param User User.
     */
    public void setUser(String User) {
        this.User = User;
    }

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
     * Get Duration. 
     * @return Duration Duration.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration.
     * @param Duration Duration.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Status. 
     * @return State Status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Status.
     * @param State Status.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Type. 
     * @return ApplicationType Type.
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Type.
     * @param ApplicationType Type.
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Number of cores multiplied by seconds. 
     * @return CoreSeconds Number of cores multiplied by seconds.
     */
    public Long getCoreSeconds() {
        return this.CoreSeconds;
    }

    /**
     * Set Number of cores multiplied by seconds.
     * @param CoreSeconds Number of cores multiplied by seconds.
     */
    public void setCoreSeconds(Long CoreSeconds) {
        this.CoreSeconds = CoreSeconds;
    }

    /**
     * Get Memory MB multiplied by seconds. 
     * @return MemorySeconds Memory MB multiplied by seconds.
     */
    public String getMemorySeconds() {
        return this.MemorySeconds;
    }

    /**
     * Set Memory MB multiplied by seconds.
     * @param MemorySeconds Memory MB multiplied by seconds.
     */
    public void setMemorySeconds(String MemorySeconds) {
        this.MemorySeconds = MemorySeconds;
    }

    /**
     * Get Insight result. 
     * @return Insight Insight result.
     */
    public String getInsight() {
        return this.Insight;
    }

    /**
     * Set Insight result.
     * @param Insight Insight result.
     */
    public void setInsight(String Insight) {
        this.Insight = Insight;
    }

    public SparkApplicationsList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkApplicationsList(SparkApplicationsList source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.CoreSeconds != null) {
            this.CoreSeconds = new Long(source.CoreSeconds);
        }
        if (source.MemorySeconds != null) {
            this.MemorySeconds = new String(source.MemorySeconds);
        }
        if (source.Insight != null) {
            this.Insight = new String(source.Insight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "CoreSeconds", this.CoreSeconds);
        this.setParamSimple(map, prefix + "MemorySeconds", this.MemorySeconds);
        this.setParamSimple(map, prefix + "Insight", this.Insight);

    }
}

