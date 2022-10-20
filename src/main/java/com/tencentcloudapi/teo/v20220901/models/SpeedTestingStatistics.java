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

public class SpeedTestingStatistics extends AbstractModel{

    /**
    * Last contentful paint, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstContentfulPaint")
    @Expose
    private Long FirstContentfulPaint;

    /**
    * Full content load, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstMeaningfulPaint")
    @Expose
    private Long FirstMeaningfulPaint;

    /**
    * Average download speed, in KB/s.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OverallDownloadSpeed")
    @Expose
    private Float OverallDownloadSpeed;

    /**
    * Rendering time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenderTime")
    @Expose
    private Long RenderTime;

    /**
    * DOM content loaded, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DocumentFinishTime")
    @Expose
    private Long DocumentFinishTime;

    /**
    * Average TCP connection, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TcpConnectionTime")
    @Expose
    private Long TcpConnectionTime;

    /**
    * Average backend response, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseTime")
    @Expose
    private Long ResponseTime;

    /**
    * Average DOM content download, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileDownloadTime")
    @Expose
    private Long FileDownloadTime;

    /**
    * Load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LoadTime")
    @Expose
    private Long LoadTime;

    /**
     * Get Last contentful paint, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstContentfulPaint Last contentful paint, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFirstContentfulPaint() {
        return this.FirstContentfulPaint;
    }

    /**
     * Set Last contentful paint, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstContentfulPaint Last contentful paint, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstContentfulPaint(Long FirstContentfulPaint) {
        this.FirstContentfulPaint = FirstContentfulPaint;
    }

    /**
     * Get Full content load, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstMeaningfulPaint Full content load, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFirstMeaningfulPaint() {
        return this.FirstMeaningfulPaint;
    }

    /**
     * Set Full content load, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstMeaningfulPaint Full content load, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstMeaningfulPaint(Long FirstMeaningfulPaint) {
        this.FirstMeaningfulPaint = FirstMeaningfulPaint;
    }

    /**
     * Get Average download speed, in KB/s.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OverallDownloadSpeed Average download speed, in KB/s.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getOverallDownloadSpeed() {
        return this.OverallDownloadSpeed;
    }

    /**
     * Set Average download speed, in KB/s.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OverallDownloadSpeed Average download speed, in KB/s.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOverallDownloadSpeed(Float OverallDownloadSpeed) {
        this.OverallDownloadSpeed = OverallDownloadSpeed;
    }

    /**
     * Get Rendering time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenderTime Rendering time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenderTime() {
        return this.RenderTime;
    }

    /**
     * Set Rendering time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenderTime Rendering time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenderTime(Long RenderTime) {
        this.RenderTime = RenderTime;
    }

    /**
     * Get DOM content loaded, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DocumentFinishTime DOM content loaded, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDocumentFinishTime() {
        return this.DocumentFinishTime;
    }

    /**
     * Set DOM content loaded, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DocumentFinishTime DOM content loaded, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDocumentFinishTime(Long DocumentFinishTime) {
        this.DocumentFinishTime = DocumentFinishTime;
    }

    /**
     * Get Average TCP connection, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TcpConnectionTime Average TCP connection, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTcpConnectionTime() {
        return this.TcpConnectionTime;
    }

    /**
     * Set Average TCP connection, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TcpConnectionTime Average TCP connection, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTcpConnectionTime(Long TcpConnectionTime) {
        this.TcpConnectionTime = TcpConnectionTime;
    }

    /**
     * Get Average backend response, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResponseTime Average backend response, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResponseTime() {
        return this.ResponseTime;
    }

    /**
     * Set Average backend response, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResponseTime Average backend response, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseTime(Long ResponseTime) {
        this.ResponseTime = ResponseTime;
    }

    /**
     * Get Average DOM content download, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileDownloadTime Average DOM content download, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileDownloadTime() {
        return this.FileDownloadTime;
    }

    /**
     * Set Average DOM content download, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileDownloadTime Average DOM content download, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileDownloadTime(Long FileDownloadTime) {
        this.FileDownloadTime = FileDownloadTime;
    }

    /**
     * Get Load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LoadTime Load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLoadTime() {
        return this.LoadTime;
    }

    /**
     * Set Load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LoadTime Load time, in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLoadTime(Long LoadTime) {
        this.LoadTime = LoadTime;
    }

    public SpeedTestingStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingStatistics(SpeedTestingStatistics source) {
        if (source.FirstContentfulPaint != null) {
            this.FirstContentfulPaint = new Long(source.FirstContentfulPaint);
        }
        if (source.FirstMeaningfulPaint != null) {
            this.FirstMeaningfulPaint = new Long(source.FirstMeaningfulPaint);
        }
        if (source.OverallDownloadSpeed != null) {
            this.OverallDownloadSpeed = new Float(source.OverallDownloadSpeed);
        }
        if (source.RenderTime != null) {
            this.RenderTime = new Long(source.RenderTime);
        }
        if (source.DocumentFinishTime != null) {
            this.DocumentFinishTime = new Long(source.DocumentFinishTime);
        }
        if (source.TcpConnectionTime != null) {
            this.TcpConnectionTime = new Long(source.TcpConnectionTime);
        }
        if (source.ResponseTime != null) {
            this.ResponseTime = new Long(source.ResponseTime);
        }
        if (source.FileDownloadTime != null) {
            this.FileDownloadTime = new Long(source.FileDownloadTime);
        }
        if (source.LoadTime != null) {
            this.LoadTime = new Long(source.LoadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstContentfulPaint", this.FirstContentfulPaint);
        this.setParamSimple(map, prefix + "FirstMeaningfulPaint", this.FirstMeaningfulPaint);
        this.setParamSimple(map, prefix + "OverallDownloadSpeed", this.OverallDownloadSpeed);
        this.setParamSimple(map, prefix + "RenderTime", this.RenderTime);
        this.setParamSimple(map, prefix + "DocumentFinishTime", this.DocumentFinishTime);
        this.setParamSimple(map, prefix + "TcpConnectionTime", this.TcpConnectionTime);
        this.setParamSimple(map, prefix + "ResponseTime", this.ResponseTime);
        this.setParamSimple(map, prefix + "FileDownloadTime", this.FileDownloadTime);
        this.setParamSimple(map, prefix + "LoadTime", this.LoadTime);

    }
}

