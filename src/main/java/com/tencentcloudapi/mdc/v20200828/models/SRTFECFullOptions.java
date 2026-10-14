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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SRTFECFullOptions extends AbstractModel {

    /**
    * Whether to enable FEC.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Number of FEC data packet Layout columns. Value range: >0
    */
    @SerializedName("Cols")
    @Expose
    private Long Cols;

    /**
    * Number of FEC data packet Layout rows. Value ranges from >=2 or <=-2.
    */
    @SerializedName("Rows")
    @Expose
    private Long Rows;

    /**
    * ARQ policy when FEC is enabled. Value: "always", "onreq", "never".
    */
    @SerializedName("ARQ")
    @Expose
    private String ARQ;

    /**
    * FEC data packet Layout organization. Value: "even", "staircase"
    */
    @SerializedName("Layout")
    @Expose
    private String Layout;

    /**
     * Get Whether to enable FEC. 
     * @return Enable Whether to enable FEC.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable FEC.
     * @param Enable Whether to enable FEC.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Number of FEC data packet Layout columns. Value range: >0 
     * @return Cols Number of FEC data packet Layout columns. Value range: >0
     */
    public Long getCols() {
        return this.Cols;
    }

    /**
     * Set Number of FEC data packet Layout columns. Value range: >0
     * @param Cols Number of FEC data packet Layout columns. Value range: >0
     */
    public void setCols(Long Cols) {
        this.Cols = Cols;
    }

    /**
     * Get Number of FEC data packet Layout rows. Value ranges from >=2 or <=-2. 
     * @return Rows Number of FEC data packet Layout rows. Value ranges from >=2 or <=-2.
     */
    public Long getRows() {
        return this.Rows;
    }

    /**
     * Set Number of FEC data packet Layout rows. Value ranges from >=2 or <=-2.
     * @param Rows Number of FEC data packet Layout rows. Value ranges from >=2 or <=-2.
     */
    public void setRows(Long Rows) {
        this.Rows = Rows;
    }

    /**
     * Get ARQ policy when FEC is enabled. Value: "always", "onreq", "never". 
     * @return ARQ ARQ policy when FEC is enabled. Value: "always", "onreq", "never".
     */
    public String getARQ() {
        return this.ARQ;
    }

    /**
     * Set ARQ policy when FEC is enabled. Value: "always", "onreq", "never".
     * @param ARQ ARQ policy when FEC is enabled. Value: "always", "onreq", "never".
     */
    public void setARQ(String ARQ) {
        this.ARQ = ARQ;
    }

    /**
     * Get FEC data packet Layout organization. Value: "even", "staircase" 
     * @return Layout FEC data packet Layout organization. Value: "even", "staircase"
     */
    public String getLayout() {
        return this.Layout;
    }

    /**
     * Set FEC data packet Layout organization. Value: "even", "staircase"
     * @param Layout FEC data packet Layout organization. Value: "even", "staircase"
     */
    public void setLayout(String Layout) {
        this.Layout = Layout;
    }

    public SRTFECFullOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SRTFECFullOptions(SRTFECFullOptions source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Cols != null) {
            this.Cols = new Long(source.Cols);
        }
        if (source.Rows != null) {
            this.Rows = new Long(source.Rows);
        }
        if (source.ARQ != null) {
            this.ARQ = new String(source.ARQ);
        }
        if (source.Layout != null) {
            this.Layout = new String(source.Layout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Cols", this.Cols);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "ARQ", this.ARQ);
        this.setParamSimple(map, prefix + "Layout", this.Layout);

    }
}

