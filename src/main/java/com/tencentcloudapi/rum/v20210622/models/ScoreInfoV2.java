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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreInfoV2 extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * Total project score.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * API performance score.
    */
    @SerializedName("ApiPerformanceScore")
    @Expose
    private Float ApiPerformanceScore;

    /**
    * API availability score.
    */
    @SerializedName("ApiAvailableScore")
    @Expose
    private Float ApiAvailableScore;

    /**
    * Total API calls.
    */
    @SerializedName("ApiNum")
    @Expose
    private Long ApiNum;

    /**
    * API failures.
    */
    @SerializedName("ApiFail")
    @Expose
    private Long ApiFail;

    /**
    * Average API duration.
    */
    @SerializedName("ApiDuration")
    @Expose
    private Float ApiDuration;

    /**
    * Page performance score.
    */
    @SerializedName("PagePerformanceScore")
    @Expose
    private Float PagePerformanceScore;

    /**
    * Page views.
    */
    @SerializedName("PagePv")
    @Expose
    private Long PagePv;

    /**
    * Unique visitors.
    */
    @SerializedName("PageUv")
    @Expose
    private Long PageUv;

    /**
    * Page errors.
    */
    @SerializedName("PageError")
    @Expose
    private Long PageError;

    /**
    * First meaningful paint.
    */
    @SerializedName("PageDuration")
    @Expose
    private Float PageDuration;

    /**
    * Average largest contentful paint (LCP).
    */
    @SerializedName("PageLCP")
    @Expose
    private Float PageLCP;

    /**
    * Average first input delay (FID).
    */
    @SerializedName("PageFID")
    @Expose
    private Float PageFID;

    /**
    * Average cumulative layout shift (CLS).
    */
    @SerializedName("PageCLS")
    @Expose
    private Float PageCLS;

    /**
    * Average first contentful paint (FCP).
    */
    @SerializedName("PageFCP")
    @Expose
    private Float PageFCP;

    /**
    * Average interaction to next paint (INP).
    */
    @SerializedName("PageINP")
    @Expose
    private Float PageINP;

    /**
    * JavaScript error score.
    */
    @SerializedName("JsErrorScore")
    @Expose
    private Float JsErrorScore;

    /**
    * Static resource availability score.
    */
    @SerializedName("StaticAvailableScore")
    @Expose
    private Float StaticAvailableScore;

    /**
    * Static resource performance score.
    */
    @SerializedName("StaticPerformanceScore")
    @Expose
    private Float StaticPerformanceScore;

    /**
    * Total static resource requests.
    */
    @SerializedName("StaticNum")
    @Expose
    private Long StaticNum;

    /**
    * Static resource loading failures.
    */
    @SerializedName("StaticFail")
    @Expose
    private Long StaticFail;

    /**
    * Static resource loading time.
    */
    @SerializedName("StaticDuration")
    @Expose
    private Float StaticDuration;

    /**
     * Get Project ID. 
     * @return ProjectID Project ID.
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set Project ID.
     * @param ProjectID Project ID.
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get Total project score. 
     * @return Score Total project score.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Total project score.
     * @param Score Total project score.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get API performance score. 
     * @return ApiPerformanceScore API performance score.
     */
    public Float getApiPerformanceScore() {
        return this.ApiPerformanceScore;
    }

    /**
     * Set API performance score.
     * @param ApiPerformanceScore API performance score.
     */
    public void setApiPerformanceScore(Float ApiPerformanceScore) {
        this.ApiPerformanceScore = ApiPerformanceScore;
    }

    /**
     * Get API availability score. 
     * @return ApiAvailableScore API availability score.
     */
    public Float getApiAvailableScore() {
        return this.ApiAvailableScore;
    }

    /**
     * Set API availability score.
     * @param ApiAvailableScore API availability score.
     */
    public void setApiAvailableScore(Float ApiAvailableScore) {
        this.ApiAvailableScore = ApiAvailableScore;
    }

    /**
     * Get Total API calls. 
     * @return ApiNum Total API calls.
     */
    public Long getApiNum() {
        return this.ApiNum;
    }

    /**
     * Set Total API calls.
     * @param ApiNum Total API calls.
     */
    public void setApiNum(Long ApiNum) {
        this.ApiNum = ApiNum;
    }

    /**
     * Get API failures. 
     * @return ApiFail API failures.
     */
    public Long getApiFail() {
        return this.ApiFail;
    }

    /**
     * Set API failures.
     * @param ApiFail API failures.
     */
    public void setApiFail(Long ApiFail) {
        this.ApiFail = ApiFail;
    }

    /**
     * Get Average API duration. 
     * @return ApiDuration Average API duration.
     */
    public Float getApiDuration() {
        return this.ApiDuration;
    }

    /**
     * Set Average API duration.
     * @param ApiDuration Average API duration.
     */
    public void setApiDuration(Float ApiDuration) {
        this.ApiDuration = ApiDuration;
    }

    /**
     * Get Page performance score. 
     * @return PagePerformanceScore Page performance score.
     */
    public Float getPagePerformanceScore() {
        return this.PagePerformanceScore;
    }

    /**
     * Set Page performance score.
     * @param PagePerformanceScore Page performance score.
     */
    public void setPagePerformanceScore(Float PagePerformanceScore) {
        this.PagePerformanceScore = PagePerformanceScore;
    }

    /**
     * Get Page views. 
     * @return PagePv Page views.
     */
    public Long getPagePv() {
        return this.PagePv;
    }

    /**
     * Set Page views.
     * @param PagePv Page views.
     */
    public void setPagePv(Long PagePv) {
        this.PagePv = PagePv;
    }

    /**
     * Get Unique visitors. 
     * @return PageUv Unique visitors.
     */
    public Long getPageUv() {
        return this.PageUv;
    }

    /**
     * Set Unique visitors.
     * @param PageUv Unique visitors.
     */
    public void setPageUv(Long PageUv) {
        this.PageUv = PageUv;
    }

    /**
     * Get Page errors. 
     * @return PageError Page errors.
     */
    public Long getPageError() {
        return this.PageError;
    }

    /**
     * Set Page errors.
     * @param PageError Page errors.
     */
    public void setPageError(Long PageError) {
        this.PageError = PageError;
    }

    /**
     * Get First meaningful paint. 
     * @return PageDuration First meaningful paint.
     */
    public Float getPageDuration() {
        return this.PageDuration;
    }

    /**
     * Set First meaningful paint.
     * @param PageDuration First meaningful paint.
     */
    public void setPageDuration(Float PageDuration) {
        this.PageDuration = PageDuration;
    }

    /**
     * Get Average largest contentful paint (LCP). 
     * @return PageLCP Average largest contentful paint (LCP).
     */
    public Float getPageLCP() {
        return this.PageLCP;
    }

    /**
     * Set Average largest contentful paint (LCP).
     * @param PageLCP Average largest contentful paint (LCP).
     */
    public void setPageLCP(Float PageLCP) {
        this.PageLCP = PageLCP;
    }

    /**
     * Get Average first input delay (FID). 
     * @return PageFID Average first input delay (FID).
     */
    public Float getPageFID() {
        return this.PageFID;
    }

    /**
     * Set Average first input delay (FID).
     * @param PageFID Average first input delay (FID).
     */
    public void setPageFID(Float PageFID) {
        this.PageFID = PageFID;
    }

    /**
     * Get Average cumulative layout shift (CLS). 
     * @return PageCLS Average cumulative layout shift (CLS).
     */
    public Float getPageCLS() {
        return this.PageCLS;
    }

    /**
     * Set Average cumulative layout shift (CLS).
     * @param PageCLS Average cumulative layout shift (CLS).
     */
    public void setPageCLS(Float PageCLS) {
        this.PageCLS = PageCLS;
    }

    /**
     * Get Average first contentful paint (FCP). 
     * @return PageFCP Average first contentful paint (FCP).
     */
    public Float getPageFCP() {
        return this.PageFCP;
    }

    /**
     * Set Average first contentful paint (FCP).
     * @param PageFCP Average first contentful paint (FCP).
     */
    public void setPageFCP(Float PageFCP) {
        this.PageFCP = PageFCP;
    }

    /**
     * Get Average interaction to next paint (INP). 
     * @return PageINP Average interaction to next paint (INP).
     */
    public Float getPageINP() {
        return this.PageINP;
    }

    /**
     * Set Average interaction to next paint (INP).
     * @param PageINP Average interaction to next paint (INP).
     */
    public void setPageINP(Float PageINP) {
        this.PageINP = PageINP;
    }

    /**
     * Get JavaScript error score. 
     * @return JsErrorScore JavaScript error score.
     */
    public Float getJsErrorScore() {
        return this.JsErrorScore;
    }

    /**
     * Set JavaScript error score.
     * @param JsErrorScore JavaScript error score.
     */
    public void setJsErrorScore(Float JsErrorScore) {
        this.JsErrorScore = JsErrorScore;
    }

    /**
     * Get Static resource availability score. 
     * @return StaticAvailableScore Static resource availability score.
     */
    public Float getStaticAvailableScore() {
        return this.StaticAvailableScore;
    }

    /**
     * Set Static resource availability score.
     * @param StaticAvailableScore Static resource availability score.
     */
    public void setStaticAvailableScore(Float StaticAvailableScore) {
        this.StaticAvailableScore = StaticAvailableScore;
    }

    /**
     * Get Static resource performance score. 
     * @return StaticPerformanceScore Static resource performance score.
     */
    public Float getStaticPerformanceScore() {
        return this.StaticPerformanceScore;
    }

    /**
     * Set Static resource performance score.
     * @param StaticPerformanceScore Static resource performance score.
     */
    public void setStaticPerformanceScore(Float StaticPerformanceScore) {
        this.StaticPerformanceScore = StaticPerformanceScore;
    }

    /**
     * Get Total static resource requests. 
     * @return StaticNum Total static resource requests.
     */
    public Long getStaticNum() {
        return this.StaticNum;
    }

    /**
     * Set Total static resource requests.
     * @param StaticNum Total static resource requests.
     */
    public void setStaticNum(Long StaticNum) {
        this.StaticNum = StaticNum;
    }

    /**
     * Get Static resource loading failures. 
     * @return StaticFail Static resource loading failures.
     */
    public Long getStaticFail() {
        return this.StaticFail;
    }

    /**
     * Set Static resource loading failures.
     * @param StaticFail Static resource loading failures.
     */
    public void setStaticFail(Long StaticFail) {
        this.StaticFail = StaticFail;
    }

    /**
     * Get Static resource loading time. 
     * @return StaticDuration Static resource loading time.
     */
    public Float getStaticDuration() {
        return this.StaticDuration;
    }

    /**
     * Set Static resource loading time.
     * @param StaticDuration Static resource loading time.
     */
    public void setStaticDuration(Float StaticDuration) {
        this.StaticDuration = StaticDuration;
    }

    public ScoreInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreInfoV2(ScoreInfoV2 source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.ApiPerformanceScore != null) {
            this.ApiPerformanceScore = new Float(source.ApiPerformanceScore);
        }
        if (source.ApiAvailableScore != null) {
            this.ApiAvailableScore = new Float(source.ApiAvailableScore);
        }
        if (source.ApiNum != null) {
            this.ApiNum = new Long(source.ApiNum);
        }
        if (source.ApiFail != null) {
            this.ApiFail = new Long(source.ApiFail);
        }
        if (source.ApiDuration != null) {
            this.ApiDuration = new Float(source.ApiDuration);
        }
        if (source.PagePerformanceScore != null) {
            this.PagePerformanceScore = new Float(source.PagePerformanceScore);
        }
        if (source.PagePv != null) {
            this.PagePv = new Long(source.PagePv);
        }
        if (source.PageUv != null) {
            this.PageUv = new Long(source.PageUv);
        }
        if (source.PageError != null) {
            this.PageError = new Long(source.PageError);
        }
        if (source.PageDuration != null) {
            this.PageDuration = new Float(source.PageDuration);
        }
        if (source.PageLCP != null) {
            this.PageLCP = new Float(source.PageLCP);
        }
        if (source.PageFID != null) {
            this.PageFID = new Float(source.PageFID);
        }
        if (source.PageCLS != null) {
            this.PageCLS = new Float(source.PageCLS);
        }
        if (source.PageFCP != null) {
            this.PageFCP = new Float(source.PageFCP);
        }
        if (source.PageINP != null) {
            this.PageINP = new Float(source.PageINP);
        }
        if (source.JsErrorScore != null) {
            this.JsErrorScore = new Float(source.JsErrorScore);
        }
        if (source.StaticAvailableScore != null) {
            this.StaticAvailableScore = new Float(source.StaticAvailableScore);
        }
        if (source.StaticPerformanceScore != null) {
            this.StaticPerformanceScore = new Float(source.StaticPerformanceScore);
        }
        if (source.StaticNum != null) {
            this.StaticNum = new Long(source.StaticNum);
        }
        if (source.StaticFail != null) {
            this.StaticFail = new Long(source.StaticFail);
        }
        if (source.StaticDuration != null) {
            this.StaticDuration = new Float(source.StaticDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "ApiPerformanceScore", this.ApiPerformanceScore);
        this.setParamSimple(map, prefix + "ApiAvailableScore", this.ApiAvailableScore);
        this.setParamSimple(map, prefix + "ApiNum", this.ApiNum);
        this.setParamSimple(map, prefix + "ApiFail", this.ApiFail);
        this.setParamSimple(map, prefix + "ApiDuration", this.ApiDuration);
        this.setParamSimple(map, prefix + "PagePerformanceScore", this.PagePerformanceScore);
        this.setParamSimple(map, prefix + "PagePv", this.PagePv);
        this.setParamSimple(map, prefix + "PageUv", this.PageUv);
        this.setParamSimple(map, prefix + "PageError", this.PageError);
        this.setParamSimple(map, prefix + "PageDuration", this.PageDuration);
        this.setParamSimple(map, prefix + "PageLCP", this.PageLCP);
        this.setParamSimple(map, prefix + "PageFID", this.PageFID);
        this.setParamSimple(map, prefix + "PageCLS", this.PageCLS);
        this.setParamSimple(map, prefix + "PageFCP", this.PageFCP);
        this.setParamSimple(map, prefix + "PageINP", this.PageINP);
        this.setParamSimple(map, prefix + "JsErrorScore", this.JsErrorScore);
        this.setParamSimple(map, prefix + "StaticAvailableScore", this.StaticAvailableScore);
        this.setParamSimple(map, prefix + "StaticPerformanceScore", this.StaticPerformanceScore);
        this.setParamSimple(map, prefix + "StaticNum", this.StaticNum);
        this.setParamSimple(map, prefix + "StaticFail", this.StaticFail);
        this.setParamSimple(map, prefix + "StaticDuration", this.StaticDuration);

    }
}

