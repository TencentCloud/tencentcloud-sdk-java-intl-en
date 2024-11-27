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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackLogInfo extends AbstractModel {

    /**
    * Details of Attack Logs
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * CLS Returned Content
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * CLS Returned Content
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * CLS Returned Content
    */
    @SerializedName("TimeStamp")
    @Expose
    private String TimeStamp;

    /**
     * Get Details of Attack Logs 
     * @return Content Details of Attack Logs
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Details of Attack Logs
     * @param Content Details of Attack Logs
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get CLS Returned Content 
     * @return FileName CLS Returned Content
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set CLS Returned Content
     * @param FileName CLS Returned Content
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get CLS Returned Content 
     * @return Source CLS Returned Content
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set CLS Returned Content
     * @param Source CLS Returned Content
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get CLS Returned Content 
     * @return TimeStamp CLS Returned Content
     */
    public String getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set CLS Returned Content
     * @param TimeStamp CLS Returned Content
     */
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public AttackLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackLogInfo(AttackLogInfo source) {
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
            this.TimeStamp = new String(source.TimeStamp);
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

