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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel {

    /**
    * JSON serialized string of the log content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Log file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Log source IP address
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Log time, in milliseconds
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get JSON serialized string of the log content 
     * @return Content JSON serialized string of the log content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set JSON serialized string of the log content
     * @param Content JSON serialized string of the log content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Log file name 
     * @return FileName Log file name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Log file name
     * @param FileName Log file name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Log source IP address 
     * @return Source Log source IP address
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source IP address
     * @param Source Log source IP address
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Log time, in milliseconds 
     * @return TimeStamp Log time, in milliseconds
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set Log time, in milliseconds
     * @param TimeStamp Log time, in milliseconds
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

