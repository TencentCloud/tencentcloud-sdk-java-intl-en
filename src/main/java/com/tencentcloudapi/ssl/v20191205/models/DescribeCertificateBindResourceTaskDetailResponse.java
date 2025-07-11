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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskDetailResponse extends AbstractModel {

    /**
    * The details of associated CLB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CLB")
    @Expose
    private ClbInstanceList [] CLB;

    /**
    * The details of associated CDN resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CDN")
    @Expose
    private CdnInstanceList [] CDN;

    /**
    * The details of associated WAF resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WAF")
    @Expose
    private WafInstanceList [] WAF;

    /**
    * The details of associated Anti-DDS resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDOS")
    @Expose
    private DdosInstanceList [] DDOS;

    /**
    * The details of associated LIVE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LIVE")
    @Expose
    private LiveInstanceList [] LIVE;

    /**
    * The details of associated VOD resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VOD")
    @Expose
    private VODInstanceList [] VOD;

    /**
    * The details of associated TKE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TKE")
    @Expose
    private TkeInstanceList [] TKE;

    /**
    * The details of associated APIGATEWAY resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIGATEWAY")
    @Expose
    private ApiGatewayInstanceList [] APIGATEWAY;

    /**
    * The details of associated TCB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TCB")
    @Expose
    private TCBInstanceList [] TCB;

    /**
    * The details of associated TEO resources.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TEO")
    @Expose
    private TeoInstanceList [] TEO;

    /**
    * The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, check the result of `BindResourceResult` ; if the status is `2`, check the `error` .
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The cache time of the current result.
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
    * Associated TSE resource details
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TSE")
    @Expose
    private TSEInstanceList [] TSE;

    /**
    * Information of associated cos resource.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("COS")
    @Expose
    private COSInstanceList [] COS;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The details of associated CLB resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CLB The details of associated CLB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClbInstanceList [] getCLB() {
        return this.CLB;
    }

    /**
     * Set The details of associated CLB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CLB The details of associated CLB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCLB(ClbInstanceList [] CLB) {
        this.CLB = CLB;
    }

    /**
     * Get The details of associated CDN resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CDN The details of associated CDN resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CdnInstanceList [] getCDN() {
        return this.CDN;
    }

    /**
     * Set The details of associated CDN resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CDN The details of associated CDN resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCDN(CdnInstanceList [] CDN) {
        this.CDN = CDN;
    }

    /**
     * Get The details of associated WAF resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WAF The details of associated WAF resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WafInstanceList [] getWAF() {
        return this.WAF;
    }

    /**
     * Set The details of associated WAF resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WAF The details of associated WAF resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWAF(WafInstanceList [] WAF) {
        this.WAF = WAF;
    }

    /**
     * Get The details of associated Anti-DDS resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDOS The details of associated Anti-DDS resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DdosInstanceList [] getDDOS() {
        return this.DDOS;
    }

    /**
     * Set The details of associated Anti-DDS resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDOS The details of associated Anti-DDS resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDOS(DdosInstanceList [] DDOS) {
        this.DDOS = DDOS;
    }

    /**
     * Get The details of associated LIVE resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LIVE The details of associated LIVE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveInstanceList [] getLIVE() {
        return this.LIVE;
    }

    /**
     * Set The details of associated LIVE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LIVE The details of associated LIVE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLIVE(LiveInstanceList [] LIVE) {
        this.LIVE = LIVE;
    }

    /**
     * Get The details of associated VOD resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VOD The details of associated VOD resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VODInstanceList [] getVOD() {
        return this.VOD;
    }

    /**
     * Set The details of associated VOD resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VOD The details of associated VOD resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVOD(VODInstanceList [] VOD) {
        this.VOD = VOD;
    }

    /**
     * Get The details of associated TKE resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TKE The details of associated TKE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TkeInstanceList [] getTKE() {
        return this.TKE;
    }

    /**
     * Set The details of associated TKE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TKE The details of associated TKE resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTKE(TkeInstanceList [] TKE) {
        this.TKE = TKE;
    }

    /**
     * Get The details of associated APIGATEWAY resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIGATEWAY The details of associated APIGATEWAY resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApiGatewayInstanceList [] getAPIGATEWAY() {
        return this.APIGATEWAY;
    }

    /**
     * Set The details of associated APIGATEWAY resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIGATEWAY The details of associated APIGATEWAY resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIGATEWAY(ApiGatewayInstanceList [] APIGATEWAY) {
        this.APIGATEWAY = APIGATEWAY;
    }

    /**
     * Get The details of associated TCB resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TCB The details of associated TCB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TCBInstanceList [] getTCB() {
        return this.TCB;
    }

    /**
     * Set The details of associated TCB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TCB The details of associated TCB resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTCB(TCBInstanceList [] TCB) {
        this.TCB = TCB;
    }

    /**
     * Get The details of associated TEO resources.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TEO The details of associated TEO resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TeoInstanceList [] getTEO() {
        return this.TEO;
    }

    /**
     * Set The details of associated TEO resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TEO The details of associated TEO resources.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTEO(TeoInstanceList [] TEO) {
        this.TEO = TEO;
    }

    /**
     * Get The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, check the result of `BindResourceResult` ; if the status is `2`, check the `error` . 
     * @return Status The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, check the result of `BindResourceResult` ; if the status is `2`, check the `error` .
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, check the result of `BindResourceResult` ; if the status is `2`, check the `error` .
     * @param Status The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, check the result of `BindResourceResult` ; if the status is `2`, check the `error` .
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The cache time of the current result. 
     * @return CacheTime The cache time of the current result.
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set The cache time of the current result.
     * @param CacheTime The cache time of the current result.
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get Associated TSE resource details
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TSE Associated TSE resource details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TSEInstanceList [] getTSE() {
        return this.TSE;
    }

    /**
     * Set Associated TSE resource details
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TSE Associated TSE resource details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTSE(TSEInstanceList [] TSE) {
        this.TSE = TSE;
    }

    /**
     * Get Information of associated cos resource.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return COS Information of associated cos resource.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public COSInstanceList [] getCOS() {
        return this.COS;
    }

    /**
     * Set Information of associated cos resource.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param COS Information of associated cos resource.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCOS(COSInstanceList [] COS) {
        this.COS = COS;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCertificateBindResourceTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateBindResourceTaskDetailResponse(DescribeCertificateBindResourceTaskDetailResponse source) {
        if (source.CLB != null) {
            this.CLB = new ClbInstanceList[source.CLB.length];
            for (int i = 0; i < source.CLB.length; i++) {
                this.CLB[i] = new ClbInstanceList(source.CLB[i]);
            }
        }
        if (source.CDN != null) {
            this.CDN = new CdnInstanceList[source.CDN.length];
            for (int i = 0; i < source.CDN.length; i++) {
                this.CDN[i] = new CdnInstanceList(source.CDN[i]);
            }
        }
        if (source.WAF != null) {
            this.WAF = new WafInstanceList[source.WAF.length];
            for (int i = 0; i < source.WAF.length; i++) {
                this.WAF[i] = new WafInstanceList(source.WAF[i]);
            }
        }
        if (source.DDOS != null) {
            this.DDOS = new DdosInstanceList[source.DDOS.length];
            for (int i = 0; i < source.DDOS.length; i++) {
                this.DDOS[i] = new DdosInstanceList(source.DDOS[i]);
            }
        }
        if (source.LIVE != null) {
            this.LIVE = new LiveInstanceList[source.LIVE.length];
            for (int i = 0; i < source.LIVE.length; i++) {
                this.LIVE[i] = new LiveInstanceList(source.LIVE[i]);
            }
        }
        if (source.VOD != null) {
            this.VOD = new VODInstanceList[source.VOD.length];
            for (int i = 0; i < source.VOD.length; i++) {
                this.VOD[i] = new VODInstanceList(source.VOD[i]);
            }
        }
        if (source.TKE != null) {
            this.TKE = new TkeInstanceList[source.TKE.length];
            for (int i = 0; i < source.TKE.length; i++) {
                this.TKE[i] = new TkeInstanceList(source.TKE[i]);
            }
        }
        if (source.APIGATEWAY != null) {
            this.APIGATEWAY = new ApiGatewayInstanceList[source.APIGATEWAY.length];
            for (int i = 0; i < source.APIGATEWAY.length; i++) {
                this.APIGATEWAY[i] = new ApiGatewayInstanceList(source.APIGATEWAY[i]);
            }
        }
        if (source.TCB != null) {
            this.TCB = new TCBInstanceList[source.TCB.length];
            for (int i = 0; i < source.TCB.length; i++) {
                this.TCB[i] = new TCBInstanceList(source.TCB[i]);
            }
        }
        if (source.TEO != null) {
            this.TEO = new TeoInstanceList[source.TEO.length];
            for (int i = 0; i < source.TEO.length; i++) {
                this.TEO[i] = new TeoInstanceList(source.TEO[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new String(source.CacheTime);
        }
        if (source.TSE != null) {
            this.TSE = new TSEInstanceList[source.TSE.length];
            for (int i = 0; i < source.TSE.length; i++) {
                this.TSE[i] = new TSEInstanceList(source.TSE[i]);
            }
        }
        if (source.COS != null) {
            this.COS = new COSInstanceList[source.COS.length];
            for (int i = 0; i < source.COS.length; i++) {
                this.COS[i] = new COSInstanceList(source.COS[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CLB.", this.CLB);
        this.setParamArrayObj(map, prefix + "CDN.", this.CDN);
        this.setParamArrayObj(map, prefix + "WAF.", this.WAF);
        this.setParamArrayObj(map, prefix + "DDOS.", this.DDOS);
        this.setParamArrayObj(map, prefix + "LIVE.", this.LIVE);
        this.setParamArrayObj(map, prefix + "VOD.", this.VOD);
        this.setParamArrayObj(map, prefix + "TKE.", this.TKE);
        this.setParamArrayObj(map, prefix + "APIGATEWAY.", this.APIGATEWAY);
        this.setParamArrayObj(map, prefix + "TCB.", this.TCB);
        this.setParamArrayObj(map, prefix + "TEO.", this.TEO);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamArrayObj(map, prefix + "TSE.", this.TSE);
        this.setParamArrayObj(map, prefix + "COS.", this.COS);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

