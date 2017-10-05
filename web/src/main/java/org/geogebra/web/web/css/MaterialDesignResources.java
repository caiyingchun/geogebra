package org.geogebra.web.web.css;

import org.geogebra.web.resources.SVGResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

@SuppressWarnings("javadoc")
public interface MaterialDesignResources extends ClientBundle {

	MaterialDesignResources INSTANCE = GWT.create(MaterialDesignResources.class);
	/** NEW MATERIAL DESIGN ICONS */

	// settings panel
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/settings/ic_arrow_drop_up_black_24px.svg")
	SVGResource arrow_drop_up();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/settings/ic_arrow_drop_down_black_24px.svg")
	SVGResource arrow_drop_down();

	// dynamic stylebar
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/color_black.svg")
	SVGResource color_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/ic_texture_black_24px.svg")
	SVGResource filling_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/ic_format_size_black_24px.svg")
	SVGResource text_size_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/ic_format_bold_black_24px.svg")
	SVGResource text_bold_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/ic_format_italic_black_24px.svg")
	SVGResource text_italic_black();

	// context menu icon resources
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_more_vert_black_24px.svg")
	SVGResource more_vert_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_more_vert_purple_24px.svg")
	SVGResource more_vert_purple();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_more_vert_mebis_24px.svg")
	SVGResource more_vert_mebis();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/rename_black.svg")
	SVGResource rename_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_content_cut_black_24px.svg")
	SVGResource cut_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/duplicate_black.svg")
	SVGResource duplicate_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_delete_black_24px.svg")
	SVGResource delete_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_label_outline_black_24px.svg")
	SVGResource label_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/angle_black.svg")
	SVGResource angle_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/pin_black.svg")
	SVGResource pin_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/unpin_black.svg")
	SVGResource unpin_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_lock_outline_black_24px.svg")
	SVGResource lock_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_lock_open_black_24px.svg")
	SVGResource lock_open_black();

	@Source("org/geogebra/common/icons/png/matDesignIcons/contextMenu/trace_black.png")
	ImageResource trace_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_play_circle_outline_black_24px.svg")
	SVGResource play_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_play_circle_outline_purple_24px.svg")
	SVGResource play_purple();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/record_to_spreadsheet_black.svg")
	SVGResource record_to_spreadsheet_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_zoom_in_black_24px.svg")
	SVGResource zoom_in_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_home_black_24px.svg")
	SVGResource home_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/show_all_objects_black.svg")
	SVGResource show_all_objects_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/arrow_drop_right_black.svg")
	SVGResource arrow_drop_right_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/arrow_drop_left_black.svg")
	SVGResource arrow_drop_left_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_check_black_24px.svg")
	SVGResource check_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_expand_more_black_24px.svg")
	SVGResource expand_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_expand_less_black_24px.svg")
	SVGResource collapse_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/contextMenu/ic_sort_black_24px.svg")
	SVGResource sort_black();

	// LINES

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_line_dash_dot.svg")
	SVGResource line_dash_dot();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_line_dashed_long.svg")
	SVGResource line_dashed_long();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_line_dashed_short.svg")
	SVGResource line_dashed_short();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_line_dotted.svg")
	SVGResource line_dotted();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_line_solid.svg")
	SVGResource line_solid();

	// POINTS

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_full.svg")
	SVGResource point_full();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_empty.svg")
	SVGResource point_empty();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_cross.svg")
	SVGResource point_cross();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_cross_diag.svg")
	SVGResource point_cross_diag();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_diamond_full.svg")
	SVGResource point_diamond();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_diamond_empty.svg")
	SVGResource point_diamond_empty();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_up.svg")
	SVGResource point_up();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_down.svg")
	SVGResource point_down();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_left.svg")
	SVGResource point_left();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/stylingbar_point_right.svg")
	SVGResource point_right();

	// PATTERNS

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/filling_cross_hatching.svg")
	SVGResource pattern_cross_hatching();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/filling_dots.svg")
	SVGResource pattern_dots();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/filling_filled.svg")
	SVGResource pattern_filled();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/filling_hatching.svg")
	SVGResource pattern_hatching();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/dynStylebar/filling_honeycomb.svg")
	SVGResource pattern_honeycomb();

	// plus menu icon resources

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/plusMenu/ic_add_black_24px.svg")
	SVGResource add_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/plusMenu/add_purple.svg")
	SVGResource add_purple();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/plusMenu/ic_help_outline_black_24px.svg")
	SVGResource icon_help_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/plusMenu/ic_format_quote_black_24px.svg")
	SVGResource icon_quote_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/plusMenu/ic_image_black_24px.svg")
	SVGResource insert_photo_black();

	// av icons
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/arrow_black.svg")
	SVGResource arrow_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/mode_symbolic_white.svg")
	SVGResource modeToggleNumeric();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/mode_numeric_white.svg")
	SVGResource modeToggleSymbolic();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/speed_up_black.svg")
	SVGResource speed_up_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/speed_down_black.svg")
	SVGResource speed_down_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/ic_pause_circle_outline_black_24px.svg")
	SVGResource pause_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/av/pause_purple.svg")
	SVGResource pause_purple();

	// ev icons
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/menu.svg")
	SVGResource menu_black_border();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/ic_settings_black_24px.svg")
	SVGResource gere();

	// @Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/gridSVG.svg")
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/point_capturing.svg")
	SVGResource snap_to_grid();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/settings.svg")
	SVGResource settings_border();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/undo.svg")
	SVGResource undo_border();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/redo.svg")
	SVGResource redo_border();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/ic_refresh_black_24px.svg")
	SVGResource refresh_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/grid_black.svg")
	SVGResource grid_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/axes_black.svg")
	SVGResource axes_black();

	// Toolbar resoures

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_more_vert_white_24px.svg")
	SVGResource more_vert_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_up_white_24px.svg")
	SVGResource toolbar_open_portrait_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_down_white_24px.svg")
	SVGResource toolbar_close_portrait_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_up_black_24px.svg")
	SVGResource toolbar_open_portrait_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_down_black_24px.svg")
	SVGResource toolbar_close_portrait_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_right_white_24px.svg")
	SVGResource toolbar_open_landscape_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_keyboard_arrow_left_white_24px.svg")
	SVGResource toolbar_close_landscape_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_menu_white_24px.svg")
	SVGResource toolbar_menu_white();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/ev/menu.svg")
	SVGResource toolbar_menu_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/av_tab_graphing_white.svg")
	SVGResource toolbar_algebra_graphing();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/av_tab_geometry_white.svg")
	SVGResource toolbar_algebra_geometry();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/tools_tab_white.svg")
	SVGResource toolbar_tools();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_filter_list_black_24px.svg")
	SVGResource filter_list_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/move_white.svg")
	SVGResource mode_move();

	// Burger Menu resources
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_content_copy_black_24px.svg")
	SVGResource copy_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_content_paste_black_24px.svg")
	SVGResource paste_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_mode_edit_black_24px.svg")
	SVGResource edit_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/graphing.svg")
	SVGResource graphing();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/geometry.svg")
	SVGResource geometry();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/whiteboard.png")
	ImageResource whiteboard();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/geogebra_logo_transparent.png")
	ImageResource geogebra_logo_transparent();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_insert_drive_file_black_24px.svg")
	SVGResource insert_file_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_search_black_24px.svg")
	SVGResource search_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_save_black_24px.svg")
	SVGResource save_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_share_black_24px.svg")
	SVGResource share_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_file_download_black_24px.svg")
	SVGResource file_download_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_print_black_24px.svg")
	SVGResource print_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_undo_black_24px.svg")
	SVGResource undo_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_redo_black_24px.svg")
	SVGResource redo_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_select_all_black_24px.svg")
	SVGResource select_all_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/geogebra.svg")
	SVGResource geogebra_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/geogebra_color.svg")
	SVGResource geogebra_color();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_language_black_24px.svg")
	SVGResource language_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_forum_black_24px.svg")
	SVGResource forum_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_info_outline_black_24px.svg")
	SVGResource info_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_bug_report_black_24px.svg")
	SVGResource bug_report_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/multiple-worksheets.svg")
	SVGResource tutorial_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/book-logo.svg")
	SVGResource manual_black();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/tools_black.png")
	ImageResource tools_black();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/tools_customize_black.png")
	ImageResource tools_customize_black();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/tools_create_black.png")
	ImageResource tools_create_black();

	@Source("org/geogebra/common/icons/png/matDesignIcons/burgerMenu/new_exercise_black.png")
	ImageResource new_exercise_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/signin_black.svg")
	SVGResource signin_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/signout_black.svg")
	SVGResource signout_black();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/burgerMenu/ic_person_black_24px.svg")
	SVGResource person_black();

	// MOW resources
	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_gesture_black_24px.svg")
	SVGResource mow_pen_panel();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/tools_tab_black.svg")
	SVGResource mow_tools_panel();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_attach_file_black_24px.svg")
	SVGResource mow_media_panel();

	@Source("org/geogebra/common/icons/svg/web/matDesignIcons/toolBar/ic_view_module_white_24px.svg")
	SVGResource mow_page_control();
}
