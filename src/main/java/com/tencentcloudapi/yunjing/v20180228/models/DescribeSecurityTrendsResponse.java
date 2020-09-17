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
    * Statistics array of malicious requests.
    */
    @SerializedName("MaliciousRequests")
    @Expose
    private SecurityTrend [] MaliciousRequests;

    /**
    * Statistics array of high-risk commands.
    */
    @SerializedName("HighRiskBashs")
    @Expose
    private SecurityTrend [] HighRiskBashs;

    /**
    * Statistics array of reverse shells.
    */
    @SerializedName("ReverseShells")
    @Expose
    private SecurityTrend [] ReverseShells;

    /**
    * Statistics array of local privilege escalations.
    */
    @SerializedName("PrivilegeEscalations")
    @Expose
    private SecurityTrend [] PrivilegeEscalations;

    /**
    * Statistics array of network attacks.
    */
    @SerializedName("CyberAttacks")
    @Expose
    private SecurityTrend [] CyberAttacks;

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
     * Get Statistics array of malicious requests. 
     * @return MaliciousRequests Statistics array of malicious requests.
     */
    public SecurityTrend [] getMaliciousRequests() {
        return this.MaliciousRequests;
    }

    /**
     * Set Statistics array of malicious requests.
     * @param MaliciousRequests Statistics array of malicious requests.
     */
    public void setMaliciousRequests(SecurityTrend [] MaliciousRequests) {
        this.MaliciousRequests = MaliciousRequests;
    }

    /**
     * Get Statistics array of high-risk commands. 
     * @return HighRiskBashs Statistics array of high-risk commands.
     */
    public SecurityTrend [] getHighRiskBashs() {
        return this.HighRiskBashs;
    }

    /**
     * Set Statistics array of high-risk commands.
     * @param HighRiskBashs Statistics array of high-risk commands.
     */
    public void setHighRiskBashs(SecurityTrend [] HighRiskBashs) {
        this.HighRiskBashs = HighRiskBashs;
    }

    /**
     * Get Statistics array of reverse shells. 
     * @return ReverseShells Statistics array of reverse shells.
     */
    public SecurityTrend [] getReverseShells() {
        return this.ReverseShells;
    }

    /**
     * Set Statistics array of reverse shells.
     * @param ReverseShells Statistics array of reverse shells.
     */
    public void setReverseShells(SecurityTrend [] ReverseShells) {
        this.ReverseShells = ReverseShells;
    }

    /**
     * Get Statistics array of local privilege escalations. 
     * @return PrivilegeEscalations Statistics array of local privilege escalations.
     */
    public SecurityTrend [] getPrivilegeEscalations() {
        return this.PrivilegeEscalations;
    }

    /**
     * Set Statistics array of local privilege escalations.
     * @param PrivilegeEscalations Statistics array of local privilege escalations.
     */
    public void setPrivilegeEscalations(SecurityTrend [] PrivilegeEscalations) {
        this.PrivilegeEscalations = PrivilegeEscalations;
    }

    /**
     * Get Statistics array of network attacks. 
     * @return CyberAttacks Statistics array of network attacks.
     */
    public SecurityTrend [] getCyberAttacks() {
        return this.CyberAttacks;
    }

    /**
     * Set Statistics array of network attacks.
     * @param CyberAttacks Statistics array of network attacks.
     */
    public void setCyberAttacks(SecurityTrend [] CyberAttacks) {
        this.CyberAttacks = CyberAttacks;
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
        this.setParamArrayObj(map, prefix + "MaliciousRequests.", this.MaliciousRequests);
        this.setParamArrayObj(map, prefix + "HighRiskBashs.", this.HighRiskBashs);
        this.setParamArrayObj(map, prefix + "ReverseShells.", this.ReverseShells);
        this.setParamArrayObj(map, prefix + "PrivilegeEscalations.", this.PrivilegeEscalations);
        this.setParamArrayObj(map, prefix + "CyberAttacks.", this.CyberAttacks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

