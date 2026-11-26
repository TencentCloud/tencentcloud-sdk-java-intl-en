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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclCondition extends AbstractModel {

    /**
    * Matching field. Valid values:
<li>host: request domain name;</li>
<li>sip: Client IP;</li>
<li>ua:User-Agent;</li>
<li>cookie: Session cookie;</li>
<li>cgi: CGI script;</li>
<li>xff: XFF extension header;</li>
<li>`url`: Request URL;
<li>accept: request content type;</li>
<li>method: request method;</li>
<li>header: request header;</li>
<li>app_proto: application layer protocol;</li>
<li>sip_proto: network layer protocol;</li>
<li>uabot: UA feature rule, available only for bot custom rules;</li>
<li>idcid: IDC rule, only available for bot custom rules;</li>
<li>sipbot: search engine rule, available only for bot custom rules;</li>
<li>portrait: profile analysis, available only for bot custom rules;</li>
<li>header_seq: Request header sequence, only available for bot custom rules;</li>
<li>hdr: Request body, available only for custom rules in Web protection.</li>
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * Matching string. When MatchFrom is header, the key of the header can be set to this parameter.
    */
    @SerializedName("MatchParam")
    @Expose
    private String MatchParam;

    /**
    * Matching relationship. Valid values:
<li>equal: string equals;</li>
<li>not_equal: value not equal to;</li>
<li>include: string containing;</li>
<li>not_include: string does not contain;</li>
<li>match: ip match;</li>
<li>not_match: ip not matched;</li>
<li>include_area: region inclusion;</li>
<li>is_empty: field with null value;</li>
<li>not_exists: key field not found;</li>
<li>regexp: regular expression matching;</li>
<li>len_gt: value greater than;</li>
<li>len_lt: value is less than;</li>
<li>len_eq: value equal to;</li>
<li>match_prefix: prefix match;</li>
<li>match_suffix: suffix matching;</li>
<li>wildcard: wildcard.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Matching content.
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get Matching field. Valid values:
<li>host: request domain name;</li>
<li>sip: Client IP;</li>
<li>ua:User-Agent;</li>
<li>cookie: Session cookie;</li>
<li>cgi: CGI script;</li>
<li>xff: XFF extension header;</li>
<li>`url`: Request URL;
<li>accept: request content type;</li>
<li>method: request method;</li>
<li>header: request header;</li>
<li>app_proto: application layer protocol;</li>
<li>sip_proto: network layer protocol;</li>
<li>uabot: UA feature rule, available only for bot custom rules;</li>
<li>idcid: IDC rule, only available for bot custom rules;</li>
<li>sipbot: search engine rule, available only for bot custom rules;</li>
<li>portrait: profile analysis, available only for bot custom rules;</li>
<li>header_seq: Request header sequence, only available for bot custom rules;</li>
<li>hdr: Request body, available only for custom rules in Web protection.</li> 
     * @return MatchFrom Matching field. Valid values:
<li>host: request domain name;</li>
<li>sip: Client IP;</li>
<li>ua:User-Agent;</li>
<li>cookie: Session cookie;</li>
<li>cgi: CGI script;</li>
<li>xff: XFF extension header;</li>
<li>`url`: Request URL;
<li>accept: request content type;</li>
<li>method: request method;</li>
<li>header: request header;</li>
<li>app_proto: application layer protocol;</li>
<li>sip_proto: network layer protocol;</li>
<li>uabot: UA feature rule, available only for bot custom rules;</li>
<li>idcid: IDC rule, only available for bot custom rules;</li>
<li>sipbot: search engine rule, available only for bot custom rules;</li>
<li>portrait: profile analysis, available only for bot custom rules;</li>
<li>header_seq: Request header sequence, only available for bot custom rules;</li>
<li>hdr: Request body, available only for custom rules in Web protection.</li>
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set Matching field. Valid values:
<li>host: request domain name;</li>
<li>sip: Client IP;</li>
<li>ua:User-Agent;</li>
<li>cookie: Session cookie;</li>
<li>cgi: CGI script;</li>
<li>xff: XFF extension header;</li>
<li>`url`: Request URL;
<li>accept: request content type;</li>
<li>method: request method;</li>
<li>header: request header;</li>
<li>app_proto: application layer protocol;</li>
<li>sip_proto: network layer protocol;</li>
<li>uabot: UA feature rule, available only for bot custom rules;</li>
<li>idcid: IDC rule, only available for bot custom rules;</li>
<li>sipbot: search engine rule, available only for bot custom rules;</li>
<li>portrait: profile analysis, available only for bot custom rules;</li>
<li>header_seq: Request header sequence, only available for bot custom rules;</li>
<li>hdr: Request body, available only for custom rules in Web protection.</li>
     * @param MatchFrom Matching field. Valid values:
<li>host: request domain name;</li>
<li>sip: Client IP;</li>
<li>ua:User-Agent;</li>
<li>cookie: Session cookie;</li>
<li>cgi: CGI script;</li>
<li>xff: XFF extension header;</li>
<li>`url`: Request URL;
<li>accept: request content type;</li>
<li>method: request method;</li>
<li>header: request header;</li>
<li>app_proto: application layer protocol;</li>
<li>sip_proto: network layer protocol;</li>
<li>uabot: UA feature rule, available only for bot custom rules;</li>
<li>idcid: IDC rule, only available for bot custom rules;</li>
<li>sipbot: search engine rule, available only for bot custom rules;</li>
<li>portrait: profile analysis, available only for bot custom rules;</li>
<li>header_seq: Request header sequence, only available for bot custom rules;</li>
<li>hdr: Request body, available only for custom rules in Web protection.</li>
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get Matching string. When MatchFrom is header, the key of the header can be set to this parameter. 
     * @return MatchParam Matching string. When MatchFrom is header, the key of the header can be set to this parameter.
     */
    public String getMatchParam() {
        return this.MatchParam;
    }

    /**
     * Set Matching string. When MatchFrom is header, the key of the header can be set to this parameter.
     * @param MatchParam Matching string. When MatchFrom is header, the key of the header can be set to this parameter.
     */
    public void setMatchParam(String MatchParam) {
        this.MatchParam = MatchParam;
    }

    /**
     * Get Matching relationship. Valid values:
<li>equal: string equals;</li>
<li>not_equal: value not equal to;</li>
<li>include: string containing;</li>
<li>not_include: string does not contain;</li>
<li>match: ip match;</li>
<li>not_match: ip not matched;</li>
<li>include_area: region inclusion;</li>
<li>is_empty: field with null value;</li>
<li>not_exists: key field not found;</li>
<li>regexp: regular expression matching;</li>
<li>len_gt: value greater than;</li>
<li>len_lt: value is less than;</li>
<li>len_eq: value equal to;</li>
<li>match_prefix: prefix match;</li>
<li>match_suffix: suffix matching;</li>
<li>wildcard: wildcard.</li> 
     * @return Operator Matching relationship. Valid values:
<li>equal: string equals;</li>
<li>not_equal: value not equal to;</li>
<li>include: string containing;</li>
<li>not_include: string does not contain;</li>
<li>match: ip match;</li>
<li>not_match: ip not matched;</li>
<li>include_area: region inclusion;</li>
<li>is_empty: field with null value;</li>
<li>not_exists: key field not found;</li>
<li>regexp: regular expression matching;</li>
<li>len_gt: value greater than;</li>
<li>len_lt: value is less than;</li>
<li>len_eq: value equal to;</li>
<li>match_prefix: prefix match;</li>
<li>match_suffix: suffix matching;</li>
<li>wildcard: wildcard.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Matching relationship. Valid values:
<li>equal: string equals;</li>
<li>not_equal: value not equal to;</li>
<li>include: string containing;</li>
<li>not_include: string does not contain;</li>
<li>match: ip match;</li>
<li>not_match: ip not matched;</li>
<li>include_area: region inclusion;</li>
<li>is_empty: field with null value;</li>
<li>not_exists: key field not found;</li>
<li>regexp: regular expression matching;</li>
<li>len_gt: value greater than;</li>
<li>len_lt: value is less than;</li>
<li>len_eq: value equal to;</li>
<li>match_prefix: prefix match;</li>
<li>match_suffix: suffix matching;</li>
<li>wildcard: wildcard.</li>
     * @param Operator Matching relationship. Valid values:
<li>equal: string equals;</li>
<li>not_equal: value not equal to;</li>
<li>include: string containing;</li>
<li>not_include: string does not contain;</li>
<li>match: ip match;</li>
<li>not_match: ip not matched;</li>
<li>include_area: region inclusion;</li>
<li>is_empty: field with null value;</li>
<li>not_exists: key field not found;</li>
<li>regexp: regular expression matching;</li>
<li>len_gt: value greater than;</li>
<li>len_lt: value is less than;</li>
<li>len_eq: value equal to;</li>
<li>match_prefix: prefix match;</li>
<li>match_suffix: suffix matching;</li>
<li>wildcard: wildcard.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Matching content. 
     * @return MatchContent Matching content.
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Matching content.
     * @param MatchContent Matching content.
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public AclCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclCondition(AclCondition source) {
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.MatchParam != null) {
            this.MatchParam = new String(source.MatchParam);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchParam", this.MatchParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

