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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityTrendsResponse extends AbstractModel{

    /**
    * Trojan event statistics array.
    */
    @SerializedName("Malwares")
    @Expose
    private SecurityTrend [] Malwares;

    /**
    * Unusual login location event statistics array.
    */
    @SerializedName("NonLocalLoginPlaces")
    @Expose
    private SecurityTrend [] NonLocalLoginPlaces;

    /**
    * Brute force attack event statistics array.
    */
    @SerializedName("BruteAttacks")
    @Expose
    private SecurityTrend [] BruteAttacks;

    /**
    * Vulnerability statistics array.
    */
    @SerializedName("Vuls")
    @Expose
    private SecurityTrend [] Vuls;

    /**
    * Baseline statistics array.
    */
    @SerializedName("BaseLines")
    @Expose
    private SecurityTrend [] BaseLines;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Trojan event statistics array. 
     * @return Malwares Trojan event statistics array.
     */
    public SecurityTrend [] getMalwares() {
        return this.Malwares;
    }

    /**
     * Set Trojan event statistics array.
     * @param Malwares Trojan event statistics array.
     */
    public void setMalwares(SecurityTrend [] Malwares) {
        this.Malwares = Malwares;
    }

    /**
     * Get Unusual login location event statistics array. 
     * @return NonLocalLoginPlaces Unusual login location event statistics array.
     */
    public SecurityTrend [] getNonLocalLoginPlaces() {
        return this.NonLocalLoginPlaces;
    }

    /**
     * Set Unusual login location event statistics array.
     * @param NonLocalLoginPlaces Unusual login location event statistics array.
     */
    public void setNonLocalLoginPlaces(SecurityTrend [] NonLocalLoginPlaces) {
        this.NonLocalLoginPlaces = NonLocalLoginPlaces;
    }

    /**
     * Get Brute force attack event statistics array. 
     * @return BruteAttacks Brute force attack event statistics array.
     */
    public SecurityTrend [] getBruteAttacks() {
        return this.BruteAttacks;
    }

    /**
     * Set Brute force attack event statistics array.
     * @param BruteAttacks Brute force attack event statistics array.
     */
    public void setBruteAttacks(SecurityTrend [] BruteAttacks) {
        this.BruteAttacks = BruteAttacks;
    }

    /**
     * Get Vulnerability statistics array. 
     * @return Vuls Vulnerability statistics array.
     */
    public SecurityTrend [] getVuls() {
        return this.Vuls;
    }

    /**
     * Set Vulnerability statistics array.
     * @param Vuls Vulnerability statistics array.
     */
    public void setVuls(SecurityTrend [] Vuls) {
        this.Vuls = Vuls;
    }

    /**
     * Get Baseline statistics array. 
     * @return BaseLines Baseline statistics array.
     */
    public SecurityTrend [] getBaseLines() {
        return this.BaseLines;
    }

    /**
     * Set Baseline statistics array.
     * @param BaseLines Baseline statistics array.
     */
    public void setBaseLines(SecurityTrend [] BaseLines) {
        this.BaseLines = BaseLines;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Malwares.", this.Malwares);
        this.setParamArrayObj(map, prefix + "NonLocalLoginPlaces.", this.NonLocalLoginPlaces);
        this.setParamArrayObj(map, prefix + "BruteAttacks.", this.BruteAttacks);
        this.setParamArrayObj(map, prefix + "Vuls.", this.Vuls);
        this.setParamArrayObj(map, prefix + "BaseLines.", this.BaseLines);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

