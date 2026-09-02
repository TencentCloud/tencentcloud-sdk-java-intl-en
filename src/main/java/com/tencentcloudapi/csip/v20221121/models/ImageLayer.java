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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageLayer extends AbstractModel {

    /**
    * <p>Image layer serial number</p>
    */
    @SerializedName("LayerIndex")
    @Expose
    private Long LayerIndex;

    /**
    * <p>Image layer id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>Image layer command line</p>
    */
    @SerializedName("LayerCmd")
    @Expose
    private String LayerCmd;

    /**
    * <p>Mirror layer size</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Critical vulnerability count</p>
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * <p>High-risk vulnerability count</p>
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * <p>medium-risk vulnerability count</p>
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * <p>Number of low-risk vulnerabilities</p>
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * <p>Number of Trojans</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>Number of sensitive information entries.</p>
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

    /**
    * <p>Image layer creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LayerCreateTime")
    @Expose
    private String LayerCreateTime;

    /**
     * Get <p>Image layer serial number</p> 
     * @return LayerIndex <p>Image layer serial number</p>
     */
    public Long getLayerIndex() {
        return this.LayerIndex;
    }

    /**
     * Set <p>Image layer serial number</p>
     * @param LayerIndex <p>Image layer serial number</p>
     */
    public void setLayerIndex(Long LayerIndex) {
        this.LayerIndex = LayerIndex;
    }

    /**
     * Get <p>Image layer id</p> 
     * @return LayerId <p>Image layer id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>Image layer id</p>
     * @param LayerId <p>Image layer id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>Image layer command line</p> 
     * @return LayerCmd <p>Image layer command line</p>
     */
    public String getLayerCmd() {
        return this.LayerCmd;
    }

    /**
     * Set <p>Image layer command line</p>
     * @param LayerCmd <p>Image layer command line</p>
     */
    public void setLayerCmd(String LayerCmd) {
        this.LayerCmd = LayerCmd;
    }

    /**
     * Get <p>Mirror layer size</p> 
     * @return Size <p>Mirror layer size</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Mirror layer size</p>
     * @param Size <p>Mirror layer size</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Critical vulnerability count</p> 
     * @return CriticalLevelVulCnt <p>Critical vulnerability count</p>
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set <p>Critical vulnerability count</p>
     * @param CriticalLevelVulCnt <p>Critical vulnerability count</p>
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
    }

    /**
     * Get <p>High-risk vulnerability count</p> 
     * @return HighLevelVulCnt <p>High-risk vulnerability count</p>
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set <p>High-risk vulnerability count</p>
     * @param HighLevelVulCnt <p>High-risk vulnerability count</p>
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get <p>medium-risk vulnerability count</p> 
     * @return MediumLevelVulCnt <p>medium-risk vulnerability count</p>
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set <p>medium-risk vulnerability count</p>
     * @param MediumLevelVulCnt <p>medium-risk vulnerability count</p>
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get <p>Number of low-risk vulnerabilities</p> 
     * @return LowLevelVulCnt <p>Number of low-risk vulnerabilities</p>
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set <p>Number of low-risk vulnerabilities</p>
     * @param LowLevelVulCnt <p>Number of low-risk vulnerabilities</p>
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get <p>Number of Trojans</p> 
     * @return VirusCnt <p>Number of Trojans</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>Number of Trojans</p>
     * @param VirusCnt <p>Number of Trojans</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>Number of sensitive information entries.</p> 
     * @return SensitiveCnt <p>Number of sensitive information entries.</p>
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set <p>Number of sensitive information entries.</p>
     * @param SensitiveCnt <p>Number of sensitive information entries.</p>
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    /**
     * Get <p>Image layer creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return LayerCreateTime <p>Image layer creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLayerCreateTime() {
        return this.LayerCreateTime;
    }

    /**
     * Set <p>Image layer creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param LayerCreateTime <p>Image layer creation time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLayerCreateTime(String LayerCreateTime) {
        this.LayerCreateTime = LayerCreateTime;
    }

    public ImageLayer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageLayer(ImageLayer source) {
        if (source.LayerIndex != null) {
            this.LayerIndex = new Long(source.LayerIndex);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.LayerCmd != null) {
            this.LayerCmd = new String(source.LayerCmd);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
        }
        if (source.LayerCreateTime != null) {
            this.LayerCreateTime = new String(source.LayerCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerIndex", this.LayerIndex);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "LayerCmd", this.LayerCmd);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);
        this.setParamSimple(map, prefix + "LayerCreateTime", this.LayerCreateTime);

    }
}

