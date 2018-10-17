/* 
#   Copyright (c) 2017 European Commission  
#   Licensed under the EUPL, Version 1.2 or – as soon they will be 
#   approved by the European Commission - subsequent versions of the 
#    EUPL (the "Licence"); 
#    You may not use this work except in compliance with the Licence. 
#    You may obtain a copy of the Licence at: 
#    * https://joinup.ec.europa.eu/page/eupl-text-11-12  
#    *
#    Unless required by applicable law or agreed to in writing, software 
#    distributed under the Licence is distributed on an "AS IS" basis, 
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
#    See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package eu.eidas.node.utils;

import eu.eidas.auth.commons.protocol.eidas.LevelOfAssurance;

public final class EidasAttributesUtil {

    /**
     * TODO: use {@link LevelOfAssurance} instead
     *
     * @deprecated use {@link LevelOfAssurance} instead
     */
    @Deprecated
    public static String getUserFriendlyLoa(final String requestLoa) {
        if (requestLoa != null) {
            int lastIndex = requestLoa.lastIndexOf('/');
            if (lastIndex > 0) {
                return requestLoa.substring(lastIndex + 1);
            } else {
                return requestLoa;
            }
        }
        return null;
    }

    private EidasAttributesUtil() {
    }
}