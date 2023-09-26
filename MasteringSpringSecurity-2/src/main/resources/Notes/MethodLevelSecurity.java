/**
 * Example for method level security
 */

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;


    // add for working
    @EnableMethodSecurity(prePostEnabled = true,  securedEnabled = true,  jsr250Enabled = true)


    // Check the req body or param or input
    @PreAuthorize("hasAnyAuthority('VIEWLOANS')")
    @PreAuthorize("hasRole('ADMIN')")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @PreAuthorize("# username == authentication.principal.username")

    // Check the res object or output
    @PostAuthorize("returnObject.username == authentication.principal.username")
    @PostAuthorize("hasPermission(returnObject, 'ADMIN')")

    @PreFilter("filterObject.username != 'test'")   // body/parameter should be any Collection
    @PostFilter("filterObject.username != 'test'")  // return object should be any Collection
