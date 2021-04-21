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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpStatusMap extends AbstractModel{

    /**
    * HTTP 2xx Status code
    */
    @SerializedName("Http2xx")
    @Expose
    private Float [] Http2xx;

    /**
    * HTTP 3xx Status code
    */
    @SerializedName("Http3xx")
    @Expose
    private Float [] Http3xx;

    /**
    * HTTP 404 Status code
    */
    @SerializedName("Http404")
    @Expose
    private Float [] Http404;

    /**
    * HTTP 4xx Status code
    */
    @SerializedName("Http4xx")
    @Expose
    private Float [] Http4xx;

    /**
    * HTTP 5xx Status code
    */
    @SerializedName("Http5xx")
    @Expose
    private Float [] Http5xx;

    /**
    * HTTP 2xx Forwarding status code
    */
    @SerializedName("SourceHttp2xx")
    @Expose
    private Float [] SourceHttp2xx;

    /**
    * HTTP 3xx Forwarding status code
    */
    @SerializedName("SourceHttp3xx")
    @Expose
    private Float [] SourceHttp3xx;

    /**
    * HTTP 404 Forwarding status code
    */
    @SerializedName("SourceHttp404")
    @Expose
    private Float [] SourceHttp404;

    /**
    * HTTP 4xx Forwarding status code
    */
    @SerializedName("SourceHttp4xx")
    @Expose
    private Float [] SourceHttp4xx;

    /**
    * HTTP 5xx Forwarding status code
    */
    @SerializedName("SourceHttp5xx")
    @Expose
    private Float [] SourceHttp5xx;

    /**
     * Get HTTP 2xx Status code 
     * @return Http2xx HTTP 2xx Status code
     */
    public Float [] getHttp2xx() {
        return this.Http2xx;
    }

    /**
     * Set HTTP 2xx Status code
     * @param Http2xx HTTP 2xx Status code
     */
    public void setHttp2xx(Float [] Http2xx) {
        this.Http2xx = Http2xx;
    }

    /**
     * Get HTTP 3xx Status code 
     * @return Http3xx HTTP 3xx Status code
     */
    public Float [] getHttp3xx() {
        return this.Http3xx;
    }

    /**
     * Set HTTP 3xx Status code
     * @param Http3xx HTTP 3xx Status code
     */
    public void setHttp3xx(Float [] Http3xx) {
        this.Http3xx = Http3xx;
    }

    /**
     * Get HTTP 404 Status code 
     * @return Http404 HTTP 404 Status code
     */
    public Float [] getHttp404() {
        return this.Http404;
    }

    /**
     * Set HTTP 404 Status code
     * @param Http404 HTTP 404 Status code
     */
    public void setHttp404(Float [] Http404) {
        this.Http404 = Http404;
    }

    /**
     * Get HTTP 4xx Status code 
     * @return Http4xx HTTP 4xx Status code
     */
    public Float [] getHttp4xx() {
        return this.Http4xx;
    }

    /**
     * Set HTTP 4xx Status code
     * @param Http4xx HTTP 4xx Status code
     */
    public void setHttp4xx(Float [] Http4xx) {
        this.Http4xx = Http4xx;
    }

    /**
     * Get HTTP 5xx Status code 
     * @return Http5xx HTTP 5xx Status code
     */
    public Float [] getHttp5xx() {
        return this.Http5xx;
    }

    /**
     * Set HTTP 5xx Status code
     * @param Http5xx HTTP 5xx Status code
     */
    public void setHttp5xx(Float [] Http5xx) {
        this.Http5xx = Http5xx;
    }

    /**
     * Get HTTP 2xx Forwarding status code 
     * @return SourceHttp2xx HTTP 2xx Forwarding status code
     */
    public Float [] getSourceHttp2xx() {
        return this.SourceHttp2xx;
    }

    /**
     * Set HTTP 2xx Forwarding status code
     * @param SourceHttp2xx HTTP 2xx Forwarding status code
     */
    public void setSourceHttp2xx(Float [] SourceHttp2xx) {
        this.SourceHttp2xx = SourceHttp2xx;
    }

    /**
     * Get HTTP 3xx Forwarding status code 
     * @return SourceHttp3xx HTTP 3xx Forwarding status code
     */
    public Float [] getSourceHttp3xx() {
        return this.SourceHttp3xx;
    }

    /**
     * Set HTTP 3xx Forwarding status code
     * @param SourceHttp3xx HTTP 3xx Forwarding status code
     */
    public void setSourceHttp3xx(Float [] SourceHttp3xx) {
        this.SourceHttp3xx = SourceHttp3xx;
    }

    /**
     * Get HTTP 404 Forwarding status code 
     * @return SourceHttp404 HTTP 404 Forwarding status code
     */
    public Float [] getSourceHttp404() {
        return this.SourceHttp404;
    }

    /**
     * Set HTTP 404 Forwarding status code
     * @param SourceHttp404 HTTP 404 Forwarding status code
     */
    public void setSourceHttp404(Float [] SourceHttp404) {
        this.SourceHttp404 = SourceHttp404;
    }

    /**
     * Get HTTP 4xx Forwarding status code 
     * @return SourceHttp4xx HTTP 4xx Forwarding status code
     */
    public Float [] getSourceHttp4xx() {
        return this.SourceHttp4xx;
    }

    /**
     * Set HTTP 4xx Forwarding status code
     * @param SourceHttp4xx HTTP 4xx Forwarding status code
     */
    public void setSourceHttp4xx(Float [] SourceHttp4xx) {
        this.SourceHttp4xx = SourceHttp4xx;
    }

    /**
     * Get HTTP 5xx Forwarding status code 
     * @return SourceHttp5xx HTTP 5xx Forwarding status code
     */
    public Float [] getSourceHttp5xx() {
        return this.SourceHttp5xx;
    }

    /**
     * Set HTTP 5xx Forwarding status code
     * @param SourceHttp5xx HTTP 5xx Forwarding status code
     */
    public void setSourceHttp5xx(Float [] SourceHttp5xx) {
        this.SourceHttp5xx = SourceHttp5xx;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Http2xx.", this.Http2xx);
        this.setParamArraySimple(map, prefix + "Http3xx.", this.Http3xx);
        this.setParamArraySimple(map, prefix + "Http404.", this.Http404);
        this.setParamArraySimple(map, prefix + "Http4xx.", this.Http4xx);
        this.setParamArraySimple(map, prefix + "Http5xx.", this.Http5xx);
        this.setParamArraySimple(map, prefix + "SourceHttp2xx.", this.SourceHttp2xx);
        this.setParamArraySimple(map, prefix + "SourceHttp3xx.", this.SourceHttp3xx);
        this.setParamArraySimple(map, prefix + "SourceHttp404.", this.SourceHttp404);
        this.setParamArraySimple(map, prefix + "SourceHttp4xx.", this.SourceHttp4xx);
        this.setParamArraySimple(map, prefix + "SourceHttp5xx.", this.SourceHttp5xx);

    }
}

