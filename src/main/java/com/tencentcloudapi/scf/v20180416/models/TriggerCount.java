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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerCount extends AbstractModel {

    /**
    * Number of COS triggers
    */
    @SerializedName("Cos")
    @Expose
    private Long Cos;

    /**
    * Number of timer triggers
    */
    @SerializedName("Timer")
    @Expose
    private Long Timer;

    /**
    * Number of CMQ triggers
    */
    @SerializedName("Cmq")
    @Expose
    private Long Cmq;

    /**
    * Total number of triggers
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of CKafka triggers
    */
    @SerializedName("Ckafka")
    @Expose
    private Long Ckafka;

    /**
    * Number of API Gateway triggers
    */
    @SerializedName("Apigw")
    @Expose
    private Long Apigw;

    /**
    * Number of CLS triggers
    */
    @SerializedName("Cls")
    @Expose
    private Long Cls;

    /**
    * Number of CLB triggers
    */
    @SerializedName("Clb")
    @Expose
    private Long Clb;

    /**
    * Number of MPS triggers
    */
    @SerializedName("Mps")
    @Expose
    private Long Mps;

    /**
    * Number of CM triggers
    */
    @SerializedName("Cm")
    @Expose
    private Long Cm;

    /**
    * Number of VOD triggers
    */
    @SerializedName("Vod")
    @Expose
    private Long Vod;

    /**
    * Number of EventBridge triggers
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Eb")
    @Expose
    private Long Eb;

    /**
     * Get Number of COS triggers 
     * @return Cos Number of COS triggers
     */
    public Long getCos() {
        return this.Cos;
    }

    /**
     * Set Number of COS triggers
     * @param Cos Number of COS triggers
     */
    public void setCos(Long Cos) {
        this.Cos = Cos;
    }

    /**
     * Get Number of timer triggers 
     * @return Timer Number of timer triggers
     */
    public Long getTimer() {
        return this.Timer;
    }

    /**
     * Set Number of timer triggers
     * @param Timer Number of timer triggers
     */
    public void setTimer(Long Timer) {
        this.Timer = Timer;
    }

    /**
     * Get Number of CMQ triggers 
     * @return Cmq Number of CMQ triggers
     */
    public Long getCmq() {
        return this.Cmq;
    }

    /**
     * Set Number of CMQ triggers
     * @param Cmq Number of CMQ triggers
     */
    public void setCmq(Long Cmq) {
        this.Cmq = Cmq;
    }

    /**
     * Get Total number of triggers 
     * @return Total Total number of triggers
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of triggers
     * @param Total Total number of triggers
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of CKafka triggers 
     * @return Ckafka Number of CKafka triggers
     */
    public Long getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set Number of CKafka triggers
     * @param Ckafka Number of CKafka triggers
     */
    public void setCkafka(Long Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Number of API Gateway triggers 
     * @return Apigw Number of API Gateway triggers
     */
    public Long getApigw() {
        return this.Apigw;
    }

    /**
     * Set Number of API Gateway triggers
     * @param Apigw Number of API Gateway triggers
     */
    public void setApigw(Long Apigw) {
        this.Apigw = Apigw;
    }

    /**
     * Get Number of CLS triggers 
     * @return Cls Number of CLS triggers
     */
    public Long getCls() {
        return this.Cls;
    }

    /**
     * Set Number of CLS triggers
     * @param Cls Number of CLS triggers
     */
    public void setCls(Long Cls) {
        this.Cls = Cls;
    }

    /**
     * Get Number of CLB triggers 
     * @return Clb Number of CLB triggers
     */
    public Long getClb() {
        return this.Clb;
    }

    /**
     * Set Number of CLB triggers
     * @param Clb Number of CLB triggers
     */
    public void setClb(Long Clb) {
        this.Clb = Clb;
    }

    /**
     * Get Number of MPS triggers 
     * @return Mps Number of MPS triggers
     */
    public Long getMps() {
        return this.Mps;
    }

    /**
     * Set Number of MPS triggers
     * @param Mps Number of MPS triggers
     */
    public void setMps(Long Mps) {
        this.Mps = Mps;
    }

    /**
     * Get Number of CM triggers 
     * @return Cm Number of CM triggers
     */
    public Long getCm() {
        return this.Cm;
    }

    /**
     * Set Number of CM triggers
     * @param Cm Number of CM triggers
     */
    public void setCm(Long Cm) {
        this.Cm = Cm;
    }

    /**
     * Get Number of VOD triggers 
     * @return Vod Number of VOD triggers
     */
    public Long getVod() {
        return this.Vod;
    }

    /**
     * Set Number of VOD triggers
     * @param Vod Number of VOD triggers
     */
    public void setVod(Long Vod) {
        this.Vod = Vod;
    }

    /**
     * Get Number of EventBridge triggers
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Eb Number of EventBridge triggers
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEb() {
        return this.Eb;
    }

    /**
     * Set Number of EventBridge triggers
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Eb Number of EventBridge triggers
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEb(Long Eb) {
        this.Eb = Eb;
    }

    public TriggerCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerCount(TriggerCount source) {
        if (source.Cos != null) {
            this.Cos = new Long(source.Cos);
        }
        if (source.Timer != null) {
            this.Timer = new Long(source.Timer);
        }
        if (source.Cmq != null) {
            this.Cmq = new Long(source.Cmq);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Long(source.Ckafka);
        }
        if (source.Apigw != null) {
            this.Apigw = new Long(source.Apigw);
        }
        if (source.Cls != null) {
            this.Cls = new Long(source.Cls);
        }
        if (source.Clb != null) {
            this.Clb = new Long(source.Clb);
        }
        if (source.Mps != null) {
            this.Mps = new Long(source.Mps);
        }
        if (source.Cm != null) {
            this.Cm = new Long(source.Cm);
        }
        if (source.Vod != null) {
            this.Vod = new Long(source.Vod);
        }
        if (source.Eb != null) {
            this.Eb = new Long(source.Eb);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cos", this.Cos);
        this.setParamSimple(map, prefix + "Timer", this.Timer);
        this.setParamSimple(map, prefix + "Cmq", this.Cmq);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Ckafka", this.Ckafka);
        this.setParamSimple(map, prefix + "Apigw", this.Apigw);
        this.setParamSimple(map, prefix + "Cls", this.Cls);
        this.setParamSimple(map, prefix + "Clb", this.Clb);
        this.setParamSimple(map, prefix + "Mps", this.Mps);
        this.setParamSimple(map, prefix + "Cm", this.Cm);
        this.setParamSimple(map, prefix + "Vod", this.Vod);
        this.setParamSimple(map, prefix + "Eb", this.Eb);

    }
}

