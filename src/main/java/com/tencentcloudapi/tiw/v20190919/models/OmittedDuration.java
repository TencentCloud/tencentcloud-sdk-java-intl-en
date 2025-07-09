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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OmittedDuration extends AbstractModel {

    /**
    * Offset of the paused time in the spliced video, in milliseconds
    */
    @SerializedName("VideoTime")
    @Expose
    private Long VideoTime;

    /**
    * Recording pause timestamp, in milliseconds
    */
    @SerializedName("PauseTime")
    @Expose
    private Long PauseTime;

    /**
    * Recording resumption timestamp, in milliseconds
    */
    @SerializedName("ResumeTime")
    @Expose
    private Long ResumeTime;

    /**
     * Get Offset of the paused time in the spliced video, in milliseconds 
     * @return VideoTime Offset of the paused time in the spliced video, in milliseconds
     */
    public Long getVideoTime() {
        return this.VideoTime;
    }

    /**
     * Set Offset of the paused time in the spliced video, in milliseconds
     * @param VideoTime Offset of the paused time in the spliced video, in milliseconds
     */
    public void setVideoTime(Long VideoTime) {
        this.VideoTime = VideoTime;
    }

    /**
     * Get Recording pause timestamp, in milliseconds 
     * @return PauseTime Recording pause timestamp, in milliseconds
     */
    public Long getPauseTime() {
        return this.PauseTime;
    }

    /**
     * Set Recording pause timestamp, in milliseconds
     * @param PauseTime Recording pause timestamp, in milliseconds
     */
    public void setPauseTime(Long PauseTime) {
        this.PauseTime = PauseTime;
    }

    /**
     * Get Recording resumption timestamp, in milliseconds 
     * @return ResumeTime Recording resumption timestamp, in milliseconds
     */
    public Long getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * Set Recording resumption timestamp, in milliseconds
     * @param ResumeTime Recording resumption timestamp, in milliseconds
     */
    public void setResumeTime(Long ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    public OmittedDuration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OmittedDuration(OmittedDuration source) {
        if (source.VideoTime != null) {
            this.VideoTime = new Long(source.VideoTime);
        }
        if (source.PauseTime != null) {
            this.PauseTime = new Long(source.PauseTime);
        }
        if (source.ResumeTime != null) {
            this.ResumeTime = new Long(source.ResumeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoTime", this.VideoTime);
        this.setParamSimple(map, prefix + "PauseTime", this.PauseTime);
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);

    }
}

